package com.katleo.task.service;

import com.katleo.task.domain.CreateTaskRequest;
import com.katleo.task.domain.UpdateTaskRequest;
import com.katleo.task.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    Task createTask(CreateTaskRequest  request);
    List<Task> listTask();
    Task updateTask(UUID taskId, UpdateTaskRequest request);
}
