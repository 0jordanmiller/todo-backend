package com.todo.todoapi.mappers;


import com.todo.todoapi.model.dto.TaskDto;
import org.mapstruct.Mapper;


public class TaskMapperImpl {
    private Map

    public void TaskMapperImpl(Mapper mapper) {
        this.mapper = new ModelMapper();
    }


    public TaskDto mapToDto(TaskEntity taskEntity) {
        return mapper(taskEntity);
    }
}
