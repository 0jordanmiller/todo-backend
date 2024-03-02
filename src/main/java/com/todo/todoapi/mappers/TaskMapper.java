package com.todo.todoapi.mappers;

import com.todo.todoapi.model.dto.TaskDto;
import com.todo.todoapi.model.entities.TaskEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TaskMapper {
    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    TaskEntity dtoToEntity(TaskDto dto);
    TaskDto entityToDto(TaskEntity entity);

}
