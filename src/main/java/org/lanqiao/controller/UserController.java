package org.lanqiao.controller;

import org.lanqiao.bean.User;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")

public class UserController {
    @Autowired //按类型自动注入用户业务类
     IUserService iUserService;

    //注册
    @PostMapping(value = "/add")
    public  int  regUser(@RequestBody  User user){
        System.out.println(user);
        return  iUserService.insertSelective(user);
    }

    //检测用户名是否存在
    @PostMapping("/check")
    public String checkUser(@RequestBody User user){
        String flag="";
        User user1=iUserService.CheckName(user);
        if (user1!=null){
            flag="400";
        }else{
            flag="200";
        }
        return flag;
    }

    //登录
    @PostMapping("/login")
    public User loginUser(@RequestBody User user){
        System.out.println(user);
        return iUserService.LoginByNameandPass(user);

    }
}
