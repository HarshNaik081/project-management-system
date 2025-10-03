# Project Management System (Spring Boot + MySQL + JWT)

Overview
This is a mid-level project management REST API demonstrating Java backend capabilities:
- Users and roles (USER, ADMIN)
- Projects with members
- Tasks assigned to users inside projects
- JWT-based authentication for secure endpoints

Quick Start (Local)
1. Java 17 + Maven required.
2. Create MySQL DB: `CREATE DATABASE pmsdb;`
3. Update `src/main/resources/application.properties` with DB creds and jwt.secret.
4. (Optional) Insert roles into `roles` table: `INSERT INTO roles (name) VALUES ('ROLE_USER'), ('ROLE_ADMIN');`
5. Build & run:
   mvn clean package
   mvn spring-boot:run

API Highlights
- POST /api/auth/signup
- POST /api/auth/signin
- POST /api/projects
- POST /api/projects/{projectId}/addUser/{userId}
- POST /api/projects/{projectId}/tasks/assign/{userId}
- GET  /api/projects/{projectId}/tasks

