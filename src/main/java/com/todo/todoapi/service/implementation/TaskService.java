package com.todo.todoapi.service.implementation;

import com.todo.todoapi.repository.TaskRepository;

public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void createTask(TaskEntity taskEntity) {
        this.taskRepository.save(taskEntity);
    }
}
