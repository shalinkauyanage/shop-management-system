# 🧁 Sweet Cupcake Shop Management System

A Java-based desktop application developed to manage the operations of a cupcake shop, including user authentication, cashier management, sales management, and supply management.

## 📌 Project Overview

The Sweet Cupcake Shop Management System is a desktop application developed using **Java** and **Java Swing**.

The system provides different functionality for **Managers** and **Cashiers** through role-based login and dashboards.

Managers can manage cashiers and supplies, while cashiers can manage sales-related activities.

The application uses **file-based data storage** to store and manage system information.

## ✨ Features

- 🔐 User Login and Authentication
- 👨‍💼 Manager Dashboard
- 🧾 Cashier Dashboard
- 👥 Cashier Management
- 💰 Sales Management
- 📦 Supply Management
- 👤 Role-Based User Management
- 📁 File-Based Data Storage
- 🖥️ Java Swing Graphical User Interface

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Application development |
| Java Swing | Graphical User Interface |
| NetBeans | Development environment |
| Object-Oriented Programming | Application design |
| File Handling | Data storage |
| Text Files | Persistent data storage |
| Apache Ant | Project build management |

## 🧩 Object-Oriented Programming Concepts

### Encapsulation

Encapsulation is demonstrated by keeping data inside classes and providing methods to access and modify that data.

For example, the `User` class contains user-related information and provides methods to access the data.

### Inheritance

Inheritance is demonstrated through the `Manager` and `Cashier` classes extending the `User` class.

```java
public class Manager extends User
```

```java
public class Cashier extends User
```

This allows the child classes to reuse properties and methods from the parent `User` class.

### Polymorphism

Polymorphism allows objects of different classes to be treated through a common parent class.

In this project, `Manager` and `Cashier` are different types of users that inherit from the `User` class.

### Abstraction

Abstraction is demonstrated by separating specific functionality into different classes.

For example, the `FileManager` class handles file-related operations, while the login-related functionality is handled separately by `LoginHandler`.

This keeps the implementation details separate from the user interface.

## 📁 Project Structure

```text
Sweet Cupcake Shop Management System
│
├── build/
│
├── data/
│
├── nbproject/
│
├── src/
│   ├── Cashier.java
│   ├── CashierDash.java
│   ├── FileManager.java
│   ├── LoginForm.java
│   ├── LoginHandler.java
│   ├── Main.java
│   ├── Manager.java
│   ├── ManagerDash.java
│   ├── NewCashier.java
│   └── User.java
│
├── .gitattributes
├── build.xml
├── manifest.mf
└── README.md
```

## 🗄️ Data Management

The application uses **file-based storage** to manage system data.

The `data` directory is used to store the application's data files.

The `FileManager` class is responsible for handling file-related operations such as reading and writing data.

## 👥 User Roles

### 👨‍💼 Manager

The Manager can:

- Log into the Manager Dashboard
- Manage cashiers
- Manage supplies
- Access management functionality

### 🧾 Cashier

The Cashier can:

- Log into the Cashier Dashboard
- Manage sales-related activities
- Access cashier functionality

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/shalinkauyanage/shop-management-system.git
```

### 2. Open the Project

Open the cloned project using **NetBeans**.

Select the:

```text
shop-management-system
```

project folder.

### 3. Build the Project

Allow NetBeans to load the project and its required configuration files.

The project uses **Apache Ant** for building.

### 4. Run the Application

Open:

```text
src/Main.java
```

and run the application from NetBeans.

The application will open with the login interface.

## 🎯 Project Purpose

This project was developed as a practical **Object-Oriented Programming** project to demonstrate:

- Java programming
- Object-Oriented Programming
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Java Swing GUI development
- File handling
- User authentication
- Role-based access
- Sales management
- Supply management

## 👨‍💻 Developer

**Shalinka Uyanage**

GitHub: [shalinkauyanage](https://github.com/shalinkauyanage)

---

⭐ Feel free to explore the repository and the Sweet Cupcake Shop Management System.
