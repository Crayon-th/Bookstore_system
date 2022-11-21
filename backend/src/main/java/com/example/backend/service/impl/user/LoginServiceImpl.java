package com.example.backend.service.impl.user;

import com.example.backend.pojo.User;
import com.example.backend.service.User.LoginService;
import com.example.backend.service.impl.utils.UserDetailsImpl;
import com.example.backend.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Override
    public Map<String, String> getToken(String username, String password) {
        //封装用户名和密码
        UsernamePasswordAuthenticationToken authenticationToken=
                new UsernamePasswordAuthenticationToken(username,password);
        System.out.println(username);
        System.out.println(password);
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        System.out.println("here");
        //验证成功取用户
        UserDetailsImpl loginUser=(UserDetailsImpl) authenticate.getPrincipal();
        User user=loginUser.getUser();

        String jwt= JwtUtil.createJWT(user.getId().toString()); //拿userid去create JWT
        Map<String,String> m=new HashMap<>();
        m.put("message","success");
        m.put("token",jwt);
        return m;
    }
}
