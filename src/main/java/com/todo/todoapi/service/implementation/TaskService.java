package com.todo.todoapi.service.implementation;

import com.todo.todoapi.mappers.TaskMapper;
import com.todo.todoapi.model.dto.TaskDto;
import com.todo.todoapi.model.entities.TaskEntity;
import com.todo.todoapi.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void createTask(TaskDto taskDto) {
        TaskEntity entity = TaskMapper.INSTANCE.dtoToEntity(taskDto);
        System.out.println(entity.getClass());
        this.taskRepository.save(entity);
    }

    public void getAllTasks() {
        System.out.println(this.taskRepository.findAll());
//        List<TaskEntity> allTasks = this.taskRepository.findAll();
//        System.out.println(allTasks);
    }

}
