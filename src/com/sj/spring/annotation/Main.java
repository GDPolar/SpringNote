package com.sj.spring.annotation;

import com.sj.spring.annotation.controller.UserController;
import com.sj.spring.annotation.repository.UserRepository;
import com.sj.spring.annotation.repository.UserRepositoryImp;
import com.sj.spring.annotation.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");
        System.out.println(context.getBean("userController"));
        System.out.println(context.getBean("userService"));
        UserRepositoryImp userRepositoryImp = (UserRepositoryImp) context.getBean("userRepositoryImp");
        UserController userController = (UserController) context.getBean("userController");
        userController.execute();
    }
}
