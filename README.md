#  Pharmacy Management System

Backend application for managing pharmacy inventory, medicine details, and billing records. Built using Spring Boot and MySQL.

---

## 📌 Table of Contents
1. [About the Project](#about-the-project)  
2. [Features](#features)  
3. [Tech Stack](#tech-stack)  
4. [Getting Started](#getting-started)  
5. [Installation](#installation)  
6. [API Endpoints](#api-endpoints)    
7. [Contributing](#contributing)  
8. [License](#license)  
9. [Author](#author)

---

##  About the Project

This system helps pharmacy stores maintain medicine records, track stock, and generate sales bills. Includes REST APIs for all core operations.

---

##  Features

- Add/update/delete medicines  
- Manage stock and expiry dates  
- Generate and track customer bills  
- Search medicines by name or type  
- Basic authentication support  

---

##  Tech Stack

- *Java 17*  
- *Spring Boot*  
- *Spring Data JPA*  
- *MySQL*  
- *Maven*  
- *Postman*  
- *Git & GitHub*

---

##  Getting Started

bash
git clone https://github.com/your-username/pharmacy-management-system.git
cd pharmacy-management-system
mvn clean install
mvn spring-boot:run


---

##  Installation

Update application.properties:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/pharmacy
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update


---

##  API Endpoints

| Method | Endpoint                 | Description            |
|--------|--------------------------|------------------------|
| GET    | /api/medicines           | Get all medicines      |
| POST   | /api/medicines           | Add new medicine       |
| PUT    | /api/medicines/{id}      | Update medicine        |
| DELETE | /api/medicines/{id}      | Delete medicine        |
| POST   | /api/bills               | Generate new bill      |

---


##  Contributing

Feel free to contribute by opening pull requests or issues.

---

##  License

Licensed under the [MIT License](LICENSE).

---

##  Author

- 👤 Tamil Selvan  
- 🔗 [GitHub](https://github.com/your-github)  
- 🔗 [LinkedIn](https://linkedin.com/in/tamil-selvan-developer)

---
