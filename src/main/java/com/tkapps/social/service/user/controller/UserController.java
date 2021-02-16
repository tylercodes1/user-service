package com.tkapps.social.service.user.controller;

import com.tkapps.social.service.user.model.DTO.UserDTO;
import com.tkapps.social.service.user.model.Users;
import com.tkapps.social.service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public List<Users> getUsers() {
        return userService.findAll();
    }

    @PostMapping("")
    public Users saveUser(@RequestBody UserDTO user) {
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public Users findUserById(@PathVariable("id") int userId) {
        return userService.findByUserId(userId);
    }

}
