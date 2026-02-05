package com.katleo.task.mapper;

import com.katleo.task.domain.CreateTaskRequest;
import com.katleo.task.domain.UpdateTaskRequest;
import com.katleo.task.domain.dto.CreateTaskRequstDto;
import com.katleo.task.domain.dto.TaskDto;
import com.katleo.task.domain.dto.UpdateTaskRequstDto;
import com.katleo.task.domain.entity.Task;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreateTaskRequstDto dto);
    TaskDto toDto(Task task);
    UpdateTaskRequest fromDto(UpdateTaskRequstDto dto);
}
