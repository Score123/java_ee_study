package com.cll.service;

import com.cll.domain.User2;

/**
 * 业务接口层
 */
public interface IUserService {



    /**
     * 根据用户名判断用户是否存在
     * @param username
     * @return
     */
    User2 findUserByUsername(String username);

    /**
     * 用户注册
     * @param user
     * @return
     */
    int register(User2 user);

}
