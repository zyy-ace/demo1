package com.ruanko.springboothelloworld.controller;

import com.ruanko.springboothelloworld.entity.User;
import com.ruanko.springboothelloworld.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String username,String password){
        User user=userService.LoginIn(username,password);
        if(user!=null){
            return "success";
        }else{
            return "login";
        }
    }

}
