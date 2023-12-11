package com.heima.service;

import com.heima.pojo.User;

public interface UserService {
    public User findUserById(Integer id);

    public void createUser(User user);

    public void deleteUserById(Integer id);
}
