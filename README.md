
````markdown
# 🚀 Project Management System (Spring Boot + MySQL + JWT)

A secure **REST API** for managing projects and tasks, built with **Spring Boot 3, MySQL, and JWT**.  
Includes **user authentication**, **role-based access**, and **CRUD APIs** for projects and tasks.


## ✨ Features
- User signup & login with JWT authentication  
- Role-based access (`USER`, `ADMIN`)  
- Create and fetch projects  
- Assign users to projects  
- Create and fetch tasks for projects  


## 🛠 Tech Stack
- Java 17, Spring Boot 3  
- MySQL + JPA/Hibernate  
- Spring Security + JWT  
- Maven, Postman  

````

## ⚙️ Run Locally

1. **Clone repo**
   
```bash
git clone https://github.com/HarshNaik081/project-management-system.git
cd project-management-system
````

2. **Setup MySQL**

```sql
CREATE DATABASE pmsdb;
USE pmsdb;
INSERT INTO roles (name) VALUES ('ROLE_USER'), ('ROLE_ADMIN');
```

Edit `src/main/resources/application.properties` with your DB credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/pmsdb
spring.datasource.username=root
spring.datasource.password=your_password
jwt.secret=ChangeThisSecretKeyForJWT
```

3. **Build & Run**

```bash
mvn clean package
mvn spring-boot:run
```

Server: `http://localhost:8080`

---

## 🔗 Example APIs

* `POST /api/auth/signup` → Register user
* `POST /api/auth/signin` → Login, get JWT
* `POST /api/projects` → Create project (requires JWT)
* `POST /api/projects/{id}/tasks/assign/{userId}` → Create task
* `GET /api/projects/{id}/tasks` → Fetch tasks in a project


## 📖 Results

* ✅ User registration and login working with JWT
* ✅ Create projects and tasks successfully
* ✅ Secure endpoints with role-based access
* ✅ Tested via Postman (collection included in repo)


