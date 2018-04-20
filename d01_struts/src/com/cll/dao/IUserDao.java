package com.cll.dao;

import com.cll.domain.User2;

/**
 * 建立持久层接口
 */
public interface IUserDao {
    /**
     * 根据用户名查询用户
     * @param name
     * @return
     */
    User2 selectUserByUsername(String name);

    /**
     * 保存用户信息
     * @param user
     * @return
     */
    int addUser(User2 user);

}
