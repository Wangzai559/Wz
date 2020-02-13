package org.lanqiao.service.impl;

import org.lanqiao.bean.User;
import org.lanqiao.dao.UserMapper;
import org.lanqiao.service.IUserService;
import org.lanqiao.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RedisService redisService;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User LoginByNameandPass(User user) {
        return userMapper.LoginByNameandPass(user  );
    }

    @Override
    public User CheckName(User user) {
        return userMapper.CheckName(user);
    }

    @Override
    public int insertSelective(User user) {
        return userMapper.insertSelective(user);
    }


}
