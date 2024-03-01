package com.todo.todoapi.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskDto {
    private Long id;
    private boolean complete;
    private String name;
    private String description;
    private String comments;

    public String toCustomString() {
        return "TaskDto{" +
                "id=" + id +
                ", complete=" + complete +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
