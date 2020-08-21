package com.muyi.bigMonster.lilianTest.ioc.dao.daoImpl;

import com.muyi.bigMonster.lilianTest.ioc.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Default User");
    }
}
