package com.katleo.task.mapper.impl;

import com.katleo.task.domain.CreateTaskRequest;
import com.katleo.task.domain.UpdateTaskRequest;
import com.katleo.task.domain.dto.CreateTaskRequstDto;
import com.katleo.task.domain.dto.TaskDto;
import com.katleo.task.domain.dto.UpdateTaskRequstDto;
import com.katleo.task.domain.entity.Task;
import com.katleo.task.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {
    @Override
    public CreateTaskRequest fromDto(CreateTaskRequstDto dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }

    @Override
    public UpdateTaskRequest fromDto(UpdateTaskRequstDto dto) {
        return new UpdateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.status(),
                dto.priority()
        );
    }
}
