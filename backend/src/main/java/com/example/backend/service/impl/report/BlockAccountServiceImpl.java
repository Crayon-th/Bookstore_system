package com.example.backend.service.impl.report;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.backend.mapper.UserMapper;
import com.example.backend.pojo.User;
import com.example.backend.service.report.BlockAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlockAccountServiceImpl implements BlockAccountService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int blockAccount(int userID) {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id",userID).set("enabled", false);
        return userMapper.update(null, updateWrapper);
    }
}
