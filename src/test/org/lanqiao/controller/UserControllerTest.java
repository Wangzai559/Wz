package org.lanqiao.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.User;
import org.lanqiao.dao.UserMapper;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.controller
 * @Date 2020/1/6 14:43
 * @Author pw
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserControllerTest {

    @Autowired
    UserMapper userMapper;
    User user = new User();

    @Test
    public void regUser() {
        user.setUserName("qqq");
        user.setUserPass("123");
        int res = userMapper.insert(user);
        System.out.println(res);

    }

    @Test
    public void checkUser() {
    }

    @Test
    public void loginUser() {
        user.setUserName("qqq");
        user.setUserPass("123");
         user =  userMapper.LoginByNameandPass(user);
        System.out.println(user);
    }
}