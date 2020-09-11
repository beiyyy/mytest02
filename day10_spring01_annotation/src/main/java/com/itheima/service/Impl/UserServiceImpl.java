package com.itheima.service.Impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("UserService")
//@Component注解:使用注解的方式配置UserService的bean对象
public class UserServiceImpl implements UserService {
    ////在需要注入依赖的属性添加注解就可以获取到这个属性的的Bean对象
    //@Autowired
    ////Qualifier:注入指定的UserDao:bean对象
    //@Qualifier("userDao")
    //在依赖项上使用@Resource注解直接byName指定bean对象注入
    //注解@Resource相当于@Autowired+@Qualifier

    @Resource(name="UserDao")
    private UserDao userDao;
    //在给简单类型的数据注入一个值时可以使用@Value注解注入一个简单值
    //1.@Value("要注入的简单值")
    //2.@Value("${properties里的key}"):获取properties文件中的指定的key值,注入进来
    @Value("jack")
    private String name;

    public void save() {
        System.out.println(this.userDao);
        System.out.println(this.name);
    }
}
