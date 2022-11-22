package com.example.backend.controller.admin;

import com.example.backend.service.admin.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AdminLoginController {
    @Autowired
    private AdminLoginService adminLoginService;

    @PostMapping("/admin/login/")
    public Map<String,String> adminlogin(@RequestParam Map<String,String> m){
        String adminname=m.get("adminname");
        String password=m.get("password");
        return adminLoginService.adminlogin(adminname,password);
    }
}
