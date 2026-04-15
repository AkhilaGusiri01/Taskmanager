package com.dhruva.Taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhruva.Taskmanager.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}