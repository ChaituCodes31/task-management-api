# Task Management API

A RESTful Task Management API built using Spring Boot, Spring Data JPA, and MySQL. The application provides user authentication and task management functionalities through REST APIs.

## Features

- User Registration
- User Login
- Create Task
- Retrieve All Tasks
- Retrieve Task By ID
- Update Task
- Delete Task
- MySQL Database Integration
- RESTful API Architecture
- Layered Architecture (Controller, Service, Repository)

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security
- MySQL
- Maven
- Lombok
- Postman
- Git & GitHub

## Project Structure

```text
src
 ├── config
 │    └── SecurityConfig
 ├── controller
 │    ├── AuthController
 │    └── TaskController
 ├── entity
 │    ├── User
 │    └── Task
 ├── repository
 │    ├── UserRepository
 │    └── TaskRepository
 ├── service
 │    ├── UserService
 │    └── TaskService
 └── TaskManagementApiApplication
```

## Authentication APIs

### Register User

POST /api/auth/register

Sample Request:

```json
{
  "email": "user@gmail.com",
  "password": "123456"
}
```

### Login User

POST /api/auth/login

Sample Request:

```json
{
  "email": "user@gmail.com",
  "password": "123456"
}
```

## Task APIs

### Create Task

POST /api/tasks

Sample Request:

```json
{
  "title": "Learn Spring Boot",
  "description": "Complete Task Management Project",
  "completed": false
}
```

### Get All Tasks

GET /api/tasks

### Get Task By ID

GET /api/tasks/{id}

### Update Task

PUT /api/tasks/{id}

Sample Request:

```json
{
  "title": "Updated Task",
  "description": "Updated Description",
  "completed": true
}
```

### Delete Task

DELETE /api/tasks/{id}

## Database

MySQL is used as the backend database for storing user and task information.

Example configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Setup Instructions

### Clone Repository

```bash
git clone https://github.com/ChaituCodes31/task-management-api.git
```

### Navigate to Project

```bash
cd task-management-api
```

### Run Application

```bash
mvn spring-boot:run
```

### Test APIs

Use Postman to test all authentication and task management endpoints.

This project was developed as a Backend Developer Internship Assignment using Spring Boot, Spring Security, Spring Data JPA, and MySQL.
