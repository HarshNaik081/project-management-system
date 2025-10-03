package com.example.pms.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDate deadline;

    @ManyToMany
    @JoinTable(name="project_users",
        joinColumns = @JoinColumn(name="project_id"),
        inverseJoinColumns = @JoinColumn(name="user_id"))
    private Set<User> members = new HashSet<>();

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDate getDeadline() { return deadline; }
    public void setDeadline(LocalDate deadline) { this.deadline = deadline; }

    public Set<User> getMembers() { return members; }
    public void setMembers(Set<User> members) { this.members = members; }
}
