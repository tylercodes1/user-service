package com.tkapps.social.service.user.repository;

import com.tkapps.social.service.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUserId(int userId);
}
