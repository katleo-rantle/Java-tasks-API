package com.katleo.task.domain;

import com.katleo.task.domain.entity.TaskPriority;
import com.katleo.task.domain.entity.TaskStatus;

import java.time.LocalDate;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskStatus status,
        TaskPriority priority
) {
}
