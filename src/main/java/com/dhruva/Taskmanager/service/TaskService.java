package com.dhruva.Taskmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhruva.Taskmanager.model.Task;
import com.dhruva.Taskmanager.model.User;
import com.dhruva.Taskmanager.repository.TaskRepository;
import com.dhruva.Taskmanager.repository.UserRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getTasksByUserEmail(String email) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return taskRepository.findByUserId(user.getId());
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}