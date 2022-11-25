package com.example.backend.service.impl.auth;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.backend.mapper.UserMapper;
import com.example.backend.pojo.Result;
import com.example.backend.pojo.User;
import com.example.backend.service.auth.UserService;
import com.example.backend.utils.SpringContextHolder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户接口实现类
 *
 * @author zhuhuix
 * @date 2020-04-03
 */
@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    private final UserMapper sysUserMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public User create(User user) {
        return sysUserMapper.insert(user) > 0 ? user : null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<User> delete(User user) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(User::getUsername, user.getUsername());
        return sysUserMapper.delete(queryWrapper) > 0 ? new Result<User>().ok(user) : new Result<User>().error("删除用户失败");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<User> update(User user) {
        return sysUserMapper.updateById(user) > 0 ? new Result<User>().ok(user) : new Result<User>().error("更新用户失败");
    }

    @Override
    public User findByUsername(String userName) {
        return sysUserMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getUsername, userName));
    }

    @Override
    public boolean registerEmailExist(String email) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(User::getEmail, email);
        return sysUserMapper.selectOne(queryWrapper) != null;
    }

    @Override
    public UserDetails getUserInfo() {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null) {
            throw new RuntimeException("登录状态已过期");
        }
        if (authentication.getPrincipal() instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            UserDetailsService userDetailsService = SpringContextHolder.getBean(UserDetailsService.class);
            return userDetailsService.loadUserByUsername(userDetails.getUsername());
        }
        throw new RuntimeException("找不到当前登录的信息");
    }
}