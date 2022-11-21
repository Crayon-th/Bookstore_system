package com.example.backend.service.impl.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.backend.mapper.UserMapper;
import com.example.backend.pojo.User;
import com.example.backend.service.User.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Map<String, String> register(String username, String password,String confirm) {
        Map<String, String> m = new HashMap<>();

        //错误情况处理
        if (username == null) {
            m.put("message","用户名不能为空");
            return m;
        }
        if(password==null){
            m.put("message","密码不能为空");
            return m;
        }
        username=username.trim();
        if(username.length()==0 || username.length()>100){ //随数据库设置变化，下同
            m.put("message","用户名长度不符合要求");
            return m;
        }
        if(password.length()==0 || password.length()>100){
            m.put("message","密码长度不符合要求");
            return m;
        }
        if(!password.equals(confirm)){
            m.put("message","两次输入密码不一致");
            return m;
        }

        QueryWrapper<User> qw=new QueryWrapper<User>();
        qw.eq("username",username);
        //如果没有的话selectOne会返回啥hhh
        User user=userMapper.selectOne(qw); //这里好像不需要selectlist吧，不可能有重复，也就更不可能有list
        if(user!=null){
            m.put("message","此用户名已被其他用户使用");
            return m;
        }

        String encoded=passwordEncoder.encode(password);
        User newuser=new User(null,username,encoded);
        userMapper.insert(newuser);

        m.put("message","注册成功");
        return m;
    }
}
