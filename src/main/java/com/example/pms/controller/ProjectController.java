package com.example.pms.controller;

import com.example.pms.model.Project;
import com.example.pms.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }

    // Create a new project
    @PostMapping("")
    public ResponseEntity<Project> createProject(@RequestBody Project p){
        return ResponseEntity.ok(projectService.createProject(p));
    }

    // Add user to a project
    @PostMapping("/{projectId}/addUser/{userId}")
    public ResponseEntity<String> addUser(@PathVariable Long projectId, @PathVariable Long userId){
        projectService.addUserToProject(projectId, userId);
        return ResponseEntity.ok("User added to project");
    }

    // Get all projects
    @GetMapping("")
    public ResponseEntity<List<Project>> getAllProjects(){
        return ResponseEntity.ok(projectService.getAllProjects());
    }

    // Get single project by ID
    @GetMapping("/{id}")
    public ResponseEntity<Project> getProject(@PathVariable Long id){
        return ResponseEntity.of(projectService.getProject(id));
    }
}
