package com.todo.todoapi.controller;

import com.todo.todoapi.model.dto.TaskDto;
import com.todo.todoapi.service.implementation.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping("/tasks")
    public ResponseEntity<String> createTask(@RequestBody TaskDto task) {
        try {
            System.out.println("recieved Complete value:  "+ task);
            taskService.createTask(task);
            return ResponseEntity.ok("Task Created" + task.toCustomString());
        } catch (Exception e) {
            System.err.println("Error creating task: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create task");
        }
    }
    @GetMapping("/tasks")
    public ResponseEntity<String> getAllTasks() {
        System.out.println("Getting tasks");
        taskService.getAllTasks();
        return ResponseEntity.ok("Here are the tasks");
    }
}

