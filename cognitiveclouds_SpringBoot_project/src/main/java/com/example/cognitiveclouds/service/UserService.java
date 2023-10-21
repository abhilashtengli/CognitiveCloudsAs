package com.example.cognitiveclouds.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.cognitiveclouds.dao.UserRepo;
import com.example.cognitiveclouds.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void addUser(User user) {
        userRepo.save(user);
    }

    public ResponseEntity<User> getUserById(int userId) {
        Optional<User> user = userRepo.findById(userId);

        if (user.isPresent()) {
            User user1 = user.get();
            return ResponseEntity.ok(user1);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    public List<User> getAllUser() {
        List<User> allUsers = userRepo.findAll();
        return allUsers;
    }

    public void deleteUser(Integer userId) {
        userRepo.deleteById(userId);
    }

    public ResponseEntity<String> updateUser(int userId, User user) {
        User userFromDb = userRepo.findById(userId).get();
        userFromDb.setEmail(user.getEmail());
        userFromDb.setPassword(user.getPassword());
        userFromDb.setUserName(user.getUserName());
        userFromDb.setFirstName(user.getFirstName());
        userFromDb.setLastName(user.getLastName());
        userRepo.save(userFromDb);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Added ");

    }
}
