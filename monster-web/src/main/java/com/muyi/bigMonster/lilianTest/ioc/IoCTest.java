package com.muyi.bigMonster.lilianTest.ioc;

import com.muyi.bigMonster.lilianTest.ioc.dao.daoImpl.UserDaoImpl;
import com.muyi.bigMonster.lilianTest.ioc.service.serviceImpl.UserServiceImpl;

public class IoCTest {

    public static void main(String[] args) throws Exception {

        UserServiceImpl userServiceImpl = new UserServiceImpl();

        UserDaoImpl userDao = new UserDaoImpl();
//        userServiceImpl.setUserDao(userDao);

        userServiceImpl.getUser();





        Class clazz = IoCTest.class;
        clazz.newInstance(); //在1.9及以后的版本中，该方法被弃用，改用: clazz.getDeclaredConstructor().newInstance();


    }
}
