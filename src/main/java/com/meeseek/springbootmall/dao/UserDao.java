package com.meeseek.springbootmall.dao;

import com.meeseek.springbootmall.dto.UserRegisterRequest;
import com.meeseek.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User getUserByEmail(String email);
}
