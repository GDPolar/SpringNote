package com.sj.spring.annotation.service;

import com.sj.spring.annotation.repository.UserRepositoryImp;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class UserService {
    private UserRepositoryImp userRepositoryImp;

    public void add(){
        System.out.println("userService add");
        userRepositoryImp.save();
    }
}
