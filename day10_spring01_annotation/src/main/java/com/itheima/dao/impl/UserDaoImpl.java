package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Component;

@Component("UserDao")
//使用Component注解配置UserDao的bean对象
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("UserDao.save......");
    }
}
