
---
# 🧾 CRUDSB – Employee Management System

![Java](https://img.shields.io/badge/Language-Java-orange)
![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-brightgreen)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![Status](https://img.shields.io/badge/Status-Completed-success)

A **Spring Boot CRUD application** designed to perform **Create, Read, Update, and Delete** operations for managing employee data.  
Built with a **layered architecture (Controller → Service → Repository)** ensuring modularity and clean code practices.

---

## ✨ **Features**
✅ Add, View, Update, and Delete Employee Records  
✅ RESTful API Endpoints  
✅ Exception Handling for Invalid IDs  
✅ Integration with MySQL Database  
✅ Tested using Postman  

---

## 🧰 **Tech Stack**
| Category | Technologies Used |
|-----------|------------------|
| **Language** | Java |
| **Frameworks** | Spring Boot, Spring Data JPA |
| **Database** | MySQL |
| **Build Tool** | Maven |
| **Testing Tool** | Postman |
| **Concepts** | CRUD Operations, Layered Architecture, Exception Handling |

---

## ⚙️ **Setup Instructions**

### 🧩 Prerequisites
- Java 17+
- Maven
- MySQL Server
- IDE (IntelliJ / Eclipse / VS Code)
- Postman (for testing)

### 🚀 Steps to Run
```bash
# Clone the repository
git clone https://github.com/your-username/CRUDSB.git

# Navigate to the project folder
cd CRUDSB

# Configure MySQL credentials in application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=yourpassword

# Build and run the project
mvn spring-boot:run
```

