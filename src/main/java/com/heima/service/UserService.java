package com.heima.service;

import com.heima.pojo.User;

public interface UserService {
    User findUserById(Integer id);

    void createUser(User user);

    void deleteUserById(Integer id);
}
