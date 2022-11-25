package com.example.backend.service.impl.auth;

import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.extra.template.Template;
import cn.hutool.extra.template.TemplateConfig;
import cn.hutool.extra.template.TemplateEngine;
import cn.hutool.extra.template.TemplateUtil;
import com.example.backend.config.JwtSecurityProperties;
import com.example.backend.pojo.User;
import com.example.backend.service.auth.AuthService;
import com.example.backend.service.auth.UserService;
import com.example.backend.utils.dto.AuthUserDto;
import com.example.backend.service.email.EmailService;
import com.example.backend.utils.dto.EmailDto;
import com.example.backend.utils.dto.JwtUserDto;
import com.example.backend.utils.redis.RedisUtils;
import com.example.backend.utils.jwt.JwtTokenUtils;
import com.example.backend.utils.rsa.RsaUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 授权登录接口实现类
 */
@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class AuthServiceImpl implements AuthService {

    //后端验证用的私钥
    @Value("${rsa.private-key}")
    private String privateKey;

    //验证码过期时间
    @Value("${code.expiration}")
    private Long expiration;

    private final JwtTokenUtils jwtTokenUtils;
    private final UserService userService;
    private final JwtSecurityProperties properties;
    private final RedisUtils redisUtils;
    private final EmailService emailService;
    private final PasswordEncoder passwordEncoder;
    private final UserService sysUserService;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;

//    @Autowired
//    private AuthenticationManager authenticationManager;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean register(AuthUserDto authUserDto) {
        // 通过email获取redis中的code
        Object value = redisUtils.get(authUserDto.getEmail());
        if (value == null || !value.toString().equals(authUserDto.getCode())) {
            throw new RuntimeException("无效验证码");
        } else {
            redisUtils.del(authUserDto.getEmail());
        }

        // 如果前端没有传入用户名，则以邮箱号作为用户名进行注册
        //isEmpty弃用了，所以这里改用.equal判断是否是未输入状态
        String userName=authUserDto.getUsername().equals("") ? authUserDto.getEmail() : authUserDto.getUsername();
        //String userName = StringUtils.isEmpty(authUserDto.getUsername()) ? authUserDto.getEmail() : authUserDto.getUsername();
        if (userService.findByUsername(userName) != null) {
            throw new RuntimeException("用户名已存在");
        }

        // 创建用户
        User sysUser = new User();
        sysUser.setUsername(userName);
        try {
//            System.out.println("\n\n\n\n");
//            System.out.println(authUserDto.getPassword());
              //sysUser.setPassword(passwordEncoder.encode(RsaUtils.decryptByPrivateKey(privateKey, authUserDto.getPassword())));
              sysUser.setPassword(passwordEncoder.encode(authUserDto.getPassword()));
        } catch (Exception e) {
            throw new RuntimeException("注册密码异常");
        }
        sysUser.setEmail(authUserDto.getEmail());
        sysUser.setEnabled(true);
        return userService.create(sysUser) != null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Map<String, Object> login(AuthUserDto authUserDto, HttpServletRequest request) {
        try {
            UsernamePasswordAuthenticationToken authenticationToken =
                    new UsernamePasswordAuthenticationToken(authUserDto.getUsername(), authUserDto.getPassword());
            System.out.println(authUserDto.getUsername());
            System.out.println(authUserDto.getPassword());
            System.out.println(passwordEncoder.matches(authUserDto.getPassword(),"$2a$10$/RA.HOhSvEoCbZ4jYubBu.oCyUCQ11stSP51s/fC0V7aqAUOycp4q"));
            System.out.println(authenticationToken);
            //Authentication authentication = authenticationManager.authenticate(authenticationToken);
            Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            System.out.println("here？？\n");
            // 生成令牌，并返回用户信息
            String token = jwtTokenUtils.createToken(authentication);
            JwtUserDto jwtUserDto = (JwtUserDto) authentication.getPrincipal();

            System.out.println(properties.getTokenValidityInSeconds());
            redisUtils.set(token, jwtUserDto, properties.getTokenValidityInSeconds() / 1000);
            return new HashMap<String, Object>(2) {{
                put("token", properties.getTokenStartWith() + token);
                put("user", jwtUserDto);
            }};
        } catch (Exception ex) {
            throw new RuntimeException("异常错误：" + ex.getMessage());
        }
    }

    @Override
    public void sendMailCode(String email) {
        // 查看注册邮箱是否存在
        if (sysUserService.registerEmailExist(email)) {
            throw new RuntimeException("注册邮箱已存在，请重新输入其他邮箱");
        }

        // 获取发送邮箱验证码的HTML模板
        TemplateEngine engine = TemplateUtil.createEngine(new TemplateConfig("template", TemplateConfig.ResourceMode.CLASSPATH));
        Template template = engine.getTemplate("email-code.ftl");

        // 从redis缓存中尝试获取验证码
        Object code = redisUtils.get(email);
        if (code == null) {
            // 如果在缓存中未获取到验证码，则产生6位随机数，放入缓存中
            code = RandomUtil.randomNumbers(6);
            if (!redisUtils.set(email, code, expiration)) {
                throw new RuntimeException("后台缓存服务异常");
            }
        }
        // 发送验证码
        emailService.send(new EmailDto(Collections.singletonList(email),
                "邮箱验证码", template.render(Dict.create().set("code", code))));

    }

    @Override
    public void logout(HttpServletRequest request) {
        redisUtils.del(jwtTokenUtils.getToken(request));
    }
}