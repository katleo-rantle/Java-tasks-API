package com.katleo.task.service.impl;

import com.katleo.task.domain.CreateTaskRequest;
import com.katleo.task.domain.entity.Task;
import com.katleo.task.domain.entity.TaskPriority;
import com.katleo.task.domain.entity.TaskStatus;
import com.katleo.task.repository.TaskRepository;
import com.katleo.task.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;
    TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();
        Task task = new Task(
                null,
                request.title(),
                request.description(),
                request.dueDate(),
                TaskStatus.OPEN,
                request.priority(),
                now,
                now
        );
        return taskRepository.save(task);
    }
}
