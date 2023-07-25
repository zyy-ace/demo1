package com.ruanko.springboothelloworld.service;

import com.ruanko.springboothelloworld.entity.User;
import com.ruanko.springboothelloworld.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    public User LoginIn(String username,String password){
        return userMapper.getInfo(username,password);
    }
}
