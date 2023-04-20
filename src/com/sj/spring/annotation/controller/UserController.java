package com.sj.spring.annotation.controller;

import com.sj.spring.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    //自动装配
    @Autowired
    private UserService userService;
    public String execute(){
        System.out.println("userController execute");
        userService.add();
        return "success";
    }
}
