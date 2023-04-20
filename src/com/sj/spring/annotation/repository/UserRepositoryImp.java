package com.sj.spring.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImp implements UserRepository {
    @Override
    public void save() {
        System.out.println("userRepository save");
    }
}
