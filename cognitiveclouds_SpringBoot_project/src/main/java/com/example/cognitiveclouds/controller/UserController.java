package com.example.cognitiveclouds.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.cognitiveclouds.dao.UserRepo;
import com.example.cognitiveclouds.model.User;
import com.example.cognitiveclouds.service.UserService;

@Repository
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody User user) {
        userService.addUser(user);
        return ResponseEntity.ok("User added successfully");
    }

    @GetMapping("/getUser/{userId}")
    public ResponseEntity<ResponseEntity<User>> getUser(@PathVariable int userId) {
        ResponseEntity<User> userById = userService.getUserById(userId);
        return ResponseEntity.ok(userById);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

    @DeleteMapping("/deleteUser/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer userId) {
        Optional<User> findById = userRepo.findById(userId);
        if (!findById.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Id not found");
        }
        userService.deleteUser(userId);
        return ResponseEntity.status(HttpStatus.OK).body("User deleted Successfully");
    }

    @PutMapping("/updateUser/{userId}")
    public ResponseEntity<String> updateUser(@PathVariable int userId, @RequestBody User user) {
        Optional<User> findById = userRepo.findById(userId);
        if (!findById.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body("User Id Not Found");
        }
        return userService.updateUser(userId, user);
    }

}
