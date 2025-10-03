package com.example.pms.controller;

import com.example.pms.model.Task;
import com.example.pms.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects/{projectId}/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService ts){
        this.taskService = ts;
    }

    // Create task under a project for a user
    @PostMapping("/assign/{userId}")
    public ResponseEntity<Task> createTask(@PathVariable Long projectId,
                                           @PathVariable Long userId,
                                           @RequestBody Task t){
        return ResponseEntity.ok(taskService.createTask(projectId, userId, t));
    }

    // Get all tasks for a project
    @GetMapping("")
    public ResponseEntity<List<Task>> getTasks(@PathVariable Long projectId){
        return ResponseEntity.ok(taskService.getTasksByProject(projectId));
    }
}
