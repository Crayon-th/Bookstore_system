package com.example.backend.service.auth;

import com.example.backend.utils.dto.AuthUserDto;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 登录授权服务接口
 */
public interface AuthService {

    //注册
    boolean register(AuthUserDto authUserDto);

    /**
     * 登陆
     * @param authUserDto 认证用户请求信息
     * @param request Http请求
     * @return 认证用户返回信息
     */
    Map<String, Object> login(AuthUserDto authUserDto, HttpServletRequest request);

    //向指定邮箱发送验证码
    void sendMailCode(String email);

    /**
     * 退出登录
     * @param request Http请求
     */
    void logout(HttpServletRequest request);
}