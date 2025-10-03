package com.example.pms.model; import jakarta.persistence.*; import lombok.*; import java.time.LocalDate; import java.util.HashSet; import java.util.Set;
@Entity @Table(name="projects") @Data @NoArgsConstructor @AllArgsConstructor
public class Project { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private String title; private String description; private LocalDate deadline;
  @ManyToMany @JoinTable(name="project_users", joinColumns=@JoinColumn(name="project_id"), inverseJoinColumns=@JoinColumn(name="user_id")) private Set<User> members = new HashSet<>(); }