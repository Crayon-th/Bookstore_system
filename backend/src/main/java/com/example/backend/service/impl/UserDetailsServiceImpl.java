package com.example.backend.service.impl;

import com.example.backend.pojo.User;
import com.example.backend.service.auth.UserService;
import com.example.backend.utils.dto.JwtUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 用户认证
 *
 * @author zhuhuix
 * @date 2020-06-15
 */
@RequiredArgsConstructor
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserService userService;

    @Override
    public JwtUserDto loadUserByUsername(String username) {
        User user;
        try {
            user = userService.findByUsername(username);
        } catch (RuntimeException e) {
            // SpringSecurity会自动转换UsernameNotFoundException为BadCredentialsException
            throw new UsernameNotFoundException("无此用户", e);
        }
        if (user == null) {
            throw new UsernameNotFoundException("无此用户");
        } else {
            if (!user.getEnabled()) {
                throw new RuntimeException("账号未激活");
            }
            return new JwtUserDto(
                    user,
                    null,
                    null
            );
        }
    }
}