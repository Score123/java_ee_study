package com.cll.service.imp;

import com.cll.dao.IUserDao;
import com.cll.dao.imp.IUserDaoImp;
import com.cll.domain.User2;
import com.cll.service.IUserService;

public class IUserServiceImp implements IUserService {

    IUserDao userDao = new IUserDaoImp();

    @Override
    public User2 findUserByUsername(String username) {
         return userDao.selectUserByUsername(username);
    }

    @Override
    public int register(User2 user) {
        return userDao.addUser(user);
    }
}
