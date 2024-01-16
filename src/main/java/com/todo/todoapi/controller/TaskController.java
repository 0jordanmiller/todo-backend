package com.todo.todoapi.controller;

import com.todo.todoapi.service.implementation.TaskService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    private TaskService taskService;

    public void TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/tasks")
    public String createTask() {

        taskService.createTask();

    }

}
