package com.example.backend.service.impl.user;

import com.example.backend.pojo.User;
import com.example.backend.service.User.InfoService;
import com.example.backend.service.impl.utils.UserDetailsImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InfoServiceImpl implements InfoService {
    @Override
    public Map<String, String> getuserinfo() {
        //获取当前上下文语境中的用户信息
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=(UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginuser=(UserDetailsImpl) usernamePasswordAuthenticationToken.getPrincipal();
        User user=loginuser.getUser();

        Map<String,String> m=new HashMap<>();
        m.put("username",user.getUsername());

        return m;
    }
}
