# Secure Task Manager API

## 🚀 Tech Stack
- Spring Boot
- Spring Security
- JWT Authentication
- H2 Database
- JPA / Hibernate
- Swagger

## 🔐 Features
- User Registration & Login
- Password Hashing (BCrypt)
- JWT-based Authentication
- Role-based Access (USER / ADMIN)
- Secure CRUD APIs
- Global Exception Handling

## 📦 API Endpoints

### Auth
POST /api/v1/auth/register  
POST /api/v1/auth/login  

### Tasks
GET /api/v1/tasks  
POST /api/v1/tasks  
DELETE /api/v1/tasks/{id}  

## 🔑 Authentication
Use JWT token in header:

Authorization: Bearer <token>

## ⚙️ Setup

1. Clone repo  
2. Run application  
3. Access Swagger UI  

## 📈 Scalability Notes

- Stateless authentication using JWT
- Modular layered architecture
- Can be extended to microservices
- Redis caching can be added
- Docker deployment possible
