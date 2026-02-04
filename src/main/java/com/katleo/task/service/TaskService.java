package com.katleo.task.service;

import com.katleo.task.domain.CreateTaskRequest;
import com.katleo.task.domain.entity.Task;

import java.util.List;

public interface TaskService {
    Task createTask(CreateTaskRequest  request);
    List<Task> listTask();
}
