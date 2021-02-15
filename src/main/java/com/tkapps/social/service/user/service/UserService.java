package com.tkapps.social.service.user.service;

import com.tkapps.social.service.user.model.User;
import com.tkapps.social.service.user.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> findAll() {
        return userRepo.findAll();
    }

    public User save(User user) {
        return userRepo.save(user);
    }

    public User findByUserId(int userId) {
        return userRepo.findByUserId(userId);
    }
}
