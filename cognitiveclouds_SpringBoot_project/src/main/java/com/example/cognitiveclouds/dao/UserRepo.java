package com.example.cognitiveclouds.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cognitiveclouds.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
