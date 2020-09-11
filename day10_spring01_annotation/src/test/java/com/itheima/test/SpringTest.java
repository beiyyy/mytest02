package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void test01() {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applictionContext.xml");
        UserDao userDao = app.getBean(UserDao.class);
        userDao.save();
        System.out.println(userDao);
        //UserDao.save......
        //com.itheima.dao.impl.UserDaoImpl@11bb571c
    }

    @Test
    public void test02() {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applictionContext.xml");
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
