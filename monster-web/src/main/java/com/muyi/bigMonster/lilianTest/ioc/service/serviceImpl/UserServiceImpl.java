package com.muyi.bigMonster.lilianTest.ioc.service.serviceImpl;

import com.muyi.bigMonster.lilianTest.ioc.dao.UserDao;
import com.muyi.bigMonster.lilianTest.ioc.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
