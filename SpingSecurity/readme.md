# 🔐 Spring Security – JWT Authentication System

![Java](https://img.shields.io/badge/Language-Java-orange)
![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-brightgreen)
![JWT](https://img.shields.io/badge/Security-JWT-blue)
![Status](https://img.shields.io/badge/Status-Completed-success)

A **Spring Boot** project implementing **JWT-based authentication and authorization** using **Spring Security**.  
This application secures RESTful APIs by validating tokens and enforcing **role-based access control** for different users.

---

## ✨ **Features**
✅ JWT Authentication & Authorization  
✅ Role-based Access Control (User/Admin)  
✅ Custom Security Filters & Token Validation  
✅ Exception Handling for Unauthorized Access  
✅ Tested using Postman  

---

## 🧰 **Tech Stack**
| Category | Technologies Used |
|-----------|------------------|
| **Language** | Java |
| **Frameworks** | Spring Boot, Spring Security |
| **Authentication** | JSON Web Token (JWT) |
| **Build Tool** | Maven |
| **Testing Tool** | Postman |
| **Concepts** | Filters, Token Validation, Security Configurations, Exception Handling |

---

## ⚙️ **Setup Instructions**

### 🧩 Prerequisites
- Java 17+
- Maven
- IDE (IntelliJ / Eclipse / VS Code)
- Postman (for API testing)

### 🚀 Steps to Run
```bash
# Clone the repository
git clone https://github.com/your-username/SpringSecurity.git

# Navigate to the project folder
cd SpringSecurity

# Build and run the application
mvn spring-boot:run
```

## 📬 **API Endpoints**

| Method | Endpoint | Description |
|--------|-----------|-------------|
| `POST` | `/auth/login` | Authenticate user and receive JWT token |
| `GET`  | `/hello/user` | Accessible to authenticated users |
| `GET`  | `/hello/admin` | Accessible only to admin role |

---

<details>
<summary>🧠 <b>Concepts Covered</b></summary>

- Spring Security Configuration  
- JWT Token Creation and Validation  
- Custom Authentication Filter  
- Role-based Authorization  
- Exception Handling and Response Management  

</details>

---
💻 Project Structure
```bash
Copy code
src/
 └── main/
     ├── java/com/example/security/
     │   ├── config/          # Security & JWT configuration
     │   ├── controller/      # Auth and Hello controllers
     │   ├── filter/          # JWT filter for request validation
     │   ├── token/           # JWT utility classes
     │   └── SpingSecurityApplication.java
     └── resources/
         └── application.properties
```
🧑‍💻 Author
Bhargav Putti
💼 Java Full Stack Developer | ☕ Passionate about Backend Engineering
🔗 GitHub Profile

---

