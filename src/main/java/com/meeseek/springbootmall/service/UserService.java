package com.meeseek.springbootmall.service;

import com.meeseek.springbootmall.dto.UserLoginRequest;
import com.meeseek.springbootmall.dto.UserRegisterRequest;
import com.meeseek.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
