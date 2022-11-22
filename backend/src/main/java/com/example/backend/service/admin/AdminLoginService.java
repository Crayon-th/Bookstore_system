package com.example.backend.service.admin;

import java.util.Map;

public interface AdminLoginService {
    Map<String,String> adminlogin(String adminname,String password);
}
