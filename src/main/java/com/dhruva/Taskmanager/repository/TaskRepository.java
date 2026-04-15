package com.dhruva.Taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhruva.Taskmanager.model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUserId(Long userId);
}