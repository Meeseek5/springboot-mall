package com.meeseek.springbootmall.service.impl;

import com.meeseek.springbootmall.dao.UserDao;
import com.meeseek.springbootmall.dto.UserRegisterRequest;
import com.meeseek.springbootmall.model.User;
import com.meeseek.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
