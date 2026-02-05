package com.katleo.task.controller;

import com.katleo.task.domain.CreateTaskRequest;
import com.katleo.task.domain.UpdateTaskRequest;
import com.katleo.task.domain.dto.CreateTaskRequstDto;
import com.katleo.task.domain.dto.TaskDto;
import com.katleo.task.domain.dto.UpdateTaskRequstDto;
import com.katleo.task.domain.entity.Task;
import com.katleo.task.mapper.TaskMapper;
import com.katleo.task.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/tasks")
public class TaskController {
    private final TaskService taskService;
    private final TaskMapper taskMapper;

    public TaskController(TaskService taskService, TaskMapper taskMapper) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }
    @PostMapping
    public ResponseEntity<TaskDto> createTask(
            @Valid @RequestBody CreateTaskRequstDto createTaskRequstDto){
        CreateTaskRequest  taskToCreate =  taskMapper.fromDto(createTaskRequstDto);
        Task createdTask = taskService.createTask(taskToCreate);
        TaskDto createdTaskDto = taskMapper.toDto(createdTask);
        return new ResponseEntity<>(createdTaskDto, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<TaskDto>> listTasks(){
        List<Task> tasks = taskService.listTask();
        List<TaskDto> taskDtos = tasks.stream().map(taskMapper::toDto).toList();
        return ResponseEntity.ok(taskDtos);
    }
    @PutMapping(path = "/{taskId}")
    public ResponseEntity<TaskDto> updateTask(
            @PathVariable UUID taskId,
            @Valid @RequestBody UpdateTaskRequstDto updateTaskRequstDto
    ){
        UpdateTaskRequest updateTaskRequest = taskMapper.fromDto(updateTaskRequstDto);
        Task task = taskService.updateTask(taskId, updateTaskRequest);
        TaskDto taskDto = taskMapper.toDto(task);
        return ResponseEntity.ok(taskDto);
    }
}
