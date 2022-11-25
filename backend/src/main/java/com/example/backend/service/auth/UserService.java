package com.example.backend.service.auth;

import com.example.backend.pojo.Result;
import com.example.backend.pojo.User;
import org.springframework.security.core.userdetails.UserDetails;


public interface UserService {
    /**
     * 增加用户
     * @param user 待新增的用户
     * @return 增加成功的用户
     */
    User create(User user);

    /**
     * 删除用户
     * @param user 待删除的用户
     * @return 删除成功的用户
     */
    Result<User> delete(User user);

    /**
     * 修改用户
     *
     * @param user 待修改的用户
     * @return 修改成功的用户
     */
    Result<User> update(User user);

    /**
     * 根据username查找用户
     * @param username 用户帐号
     * @return 用户帐号对应的用户
     */
    User findByUsername(String username);

    /**
     * 判断注册使用的邮箱是否存在
     * @param email 邮箱号
     * @return 是否找到
     */
    boolean registerEmailExist(String email);

    /**
     * 获取用户信息
     * @return 用户信息
     */
    UserDetails getUserInfo();

}
