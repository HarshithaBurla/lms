package com.example.lms1.service;

import com.example.lms1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User saveUser(User user);
}
