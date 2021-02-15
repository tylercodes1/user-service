package com.tkapps.social.service.user.controller;

import com.tkapps.social.service.user.model.User;
import com.tkapps.social.service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public List<User> getUsers() {
        return userService.findAll();
    }

    @PostMapping("")
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") int userId) {
        return userService.findByUserId(userId);
    }

}
