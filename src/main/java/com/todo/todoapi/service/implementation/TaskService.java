package com.todo.todoapi.service.implementation;

import com.todo.todoapi.mappers.TaskMapper;
import com.todo.todoapi.model.dto.TaskDto;
import com.todo.todoapi.model.entities.TaskEntity;
import com.todo.todoapi.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<TaskDto> getAllTasks() {
        Iterable<TaskEntity> allTasks = this.taskRepository.findAll();
        List<TaskDto> mappedTasks = new ArrayList<>();
        for (TaskEntity taskEntity : allTasks) {
            mappedTasks.add(TaskMapper.INSTANCE.entityToDto(taskEntity));
        }
        System.out.println(mappedTasks);
        return mappedTasks;
    }

}
