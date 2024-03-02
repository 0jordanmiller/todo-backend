package com.todo.todoapi.controller;

import com.todo.todoapi.model.dto.TaskDto;
import com.todo.todoapi.service.implementation.TaskService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping("/tasks")
    public ResponseEntity<String> createTask(@RequestBody TaskDto task) {
        try {
            taskService.createTask(task);
            return ResponseEntity.ok("Task Created" + task.toCustomString());
        } catch (Exception e) {
            System.err.println("Error creating task: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create task");
        }
    }
    @GetMapping("/tasks")
    public ResponseEntity<List<TaskDto>> getAllTasks() {
        try {
            System.out.println("Getting tasks");
            List<TaskDto> allTasks = taskService.getAllTasks();
            return ResponseEntity.ok(allTasks);
        } catch (Exception e) {
            System.err.println("Error getting all tasks: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}

