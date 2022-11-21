package com.example.backend.controller.user;

import com.example.backend.service.User.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RegisterController  {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/user/register/")
    public Map<String,String> register(@RequestParam Map<String,String> m){
        String username=m.get("username");
        String password=m.get("password");
        String confirm = m.get("confirm");
        System.out.println(username);
        return registerService.register(username,password,confirm);
    }
}
