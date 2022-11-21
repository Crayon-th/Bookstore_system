package com.example.backend.service.User;

import java.util.Map;

public interface RegisterService {
    Map<String,String> register(String username,String password,String confirm);
}
