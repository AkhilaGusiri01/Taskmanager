package com.dhruva.Taskmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dhruva.Taskmanager.model.Role;
import com.dhruva.Taskmanager.model.User;
import com.dhruva.Taskmanager.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User register(User user) {

        // check if email already exists
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }

        // hash password
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // default role
        user.setRole(Role.USER);

        return userRepository.save(user);
    }
}