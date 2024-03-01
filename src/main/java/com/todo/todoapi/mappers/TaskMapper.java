package com.todo.todoapi.mappers;

import com.todo.todoapi.model.dto.TaskDto;
import com.todo.todoapi.model.entities.TaskEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TaskMapper {
    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);
//    @Mapping(target = "name", source = "dto.name")
//    @Mapping(target = "description", source = "dto.description")
    TaskEntity dtoToEntity(TaskDto dto);

//    @Mapping(target = "name", source = "entity.name")
//    @Mapping(target = "description", source = "entity.description")
    TaskDto entityToDto(TaskEntity entity);
}
