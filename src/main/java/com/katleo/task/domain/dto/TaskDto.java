package com.katleo.task.domain.dto;

import com.katleo.task.domain.entity.TaskPriority;
import com.katleo.task.domain.entity.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
