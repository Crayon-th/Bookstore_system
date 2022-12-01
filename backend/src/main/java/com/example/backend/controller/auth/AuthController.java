package com.example.backend.controller.auth;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.backend.mapper.UserMapper;
import com.example.backend.pojo.User;
import com.example.backend.service.auth.AuthService;
import com.example.backend.utils.dto.AuthUserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * api登录授权
 */
@Slf4j
@RestController
@RequestMapping("/api/auth")
@Api(tags = "系统授权接口")
public class AuthController {
    private final PasswordEncoder passwordEncoder;
    @Autowired
    private UserMapper userMapper;

    private final AuthService authService;

    public AuthController(PasswordEncoder passwordEncoder, AuthService authService) {
        this.passwordEncoder = passwordEncoder;
        this.authService = authService;
    }

    @ApiOperation("发送邮箱验证码")
    @PostMapping(value = "/getEmailCode")
    public ResponseEntity<Object> getEmailCode(@RequestParam String email) {
        authService.sendMailCode(email);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation("注册")
    @PostMapping(value = "/register")
    public ResponseEntity<Object> register(@RequestBody AuthUserDto authUserDto) {
        return ResponseEntity.ok(authService.register(authUserDto));
    }

    @ApiOperation("登录授权")
    @PostMapping(value = "/login")
    public ResponseEntity<Object> login(@RequestBody AuthUserDto authUserDto, HttpServletRequest request) {
        return ResponseEntity.ok(authService.login(authUserDto, request));
    }

    @ApiOperation("退出登录")
    @DeleteMapping(value = "/logout")
    public ResponseEntity<Object> logout(HttpServletRequest request) {
        authService.logout(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation("修改头像")
    @PostMapping("/changePortrait")
    public int changePortrait(int id,String seed){
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id",id).set("seed", seed);
        return userMapper.update(null, updateWrapper);
    }

    @ApiOperation("修改用户名")
    @PostMapping("/changeUsername")
    public int changeUsername(int id,String username){
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id",id).set("username", username);
        return userMapper.update(null, updateWrapper);
    }

    @ApiOperation("修改密码")
    @PostMapping("/changePassword")
    public int changePassword(int id,String oldPassword, String newPassword){
        User user=userMapper.selectById(id);
        if(!passwordEncoder.matches(oldPassword,user.getPassword()))
            return 0;
        user.setPassword(passwordEncoder.encode(newPassword));
        userMapper.updateById(user);
        return 1;
    }

}