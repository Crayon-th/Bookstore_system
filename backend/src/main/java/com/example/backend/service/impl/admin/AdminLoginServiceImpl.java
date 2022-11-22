package com.example.backend.service.impl.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.backend.mapper.AdminMapper;
import com.example.backend.pojo.Admin;
import com.example.backend.service.admin.AdminLoginService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Map<String, String> adminlogin(String adminname, String password) {
        QueryWrapper<Admin> qw=new QueryWrapper<>();
        qw.eq("adminname",adminname);
        Admin admin =adminMapper.selectOne(qw);
        Map<String,String> m=new HashMap<>();
        if(admin==null){
            m.put("message","管理员账号不存在");
            return m;
        }

        String salt=admin.getSalt();
        String encoded = new SimpleHash("md5", password, salt, 2).toString();
        if(encoded.equals(admin.getPassword())){
            m.put("message","succeed");
        }
        else{
            m.put("message","无法登陆，请重新输入");
        }
        return m;
    }
}
