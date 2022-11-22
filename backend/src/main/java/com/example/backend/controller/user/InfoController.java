package com.example.backend.controller.user;

import com.example.backend.service.user.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/user/userinfo")
    public Map<String,String> getuserinfo(){
        return infoService.getuserinfo();
    }
}
