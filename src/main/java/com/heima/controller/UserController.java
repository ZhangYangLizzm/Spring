package com.heima.controller;

import com.heima.pojo.User;
import com.heima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    public User findUserById(Integer id){

        return userService.findUserById(id);
    }

    @PostMapping("/create")
    public void createUser(@RequestParam("name") String name,
                           @RequestParam("age") Short age,
                           @RequestParam("gender") Short gender,
                           @RequestParam("phone") String phone){

        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setGender(gender);
        user.setPhone(phone);

        userService.createUser(user);
    }


    @DeleteMapping("/delete")
    public void deleteUserById(@RequestParam("id")Integer id){
        userService.deleteUserById(id);
    }
}
