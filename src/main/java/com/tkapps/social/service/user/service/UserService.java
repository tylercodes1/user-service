package com.tkapps.social.service.user.service;

import com.tkapps.social.service.user.model.DTO.UserDTO;
import com.tkapps.social.service.user.model.Users;
import com.tkapps.social.service.user.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<Users> findAll() {
        return userRepo.findAll();
    }

    public Users save(UserDTO user) {
        Users userSave = new Users(0, user.getFirstName(), user.getLastName(), user.getUsername(), user.getEmail());
        return userRepo.save(userSave);
    }

    public Users findByUserId(int userId) {
        return userRepo.findByUserId(userId);
    }
}
