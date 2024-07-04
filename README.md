# Java-Spring-Boot-Bank-app
This is a Spring Boot application that simulates different types of bank accounts. It includes basic functionalities such as crediting, debiting, and adding interest to accounts. The application utilises inheritance in Java and RESTful services using Spring Boot.

Project structure:

src/main/java/com/example/SpringAccount/
├── Account.java
├── AccountController.java
├── ChequeAccount.java
├── InterestAccount.java
├── SpringAccountApplication.java
└── SpringAccountApplicationController.java

Files Description

Account.java: The base class for bank accounts with basic functionalities like credit, debit, and balance management.
ChequeAccount.java: Inherits from Account and adds an overdraft limit feature.

InterestAccount.java: Inherits from Account and adds a monthly interest rate feature.

AccountController.java: REST controller to handle HTTP requests related to account operations.

SpringAccountApplication.java: The main entry point for the Spring Boot application. It also configures beans for ChequeAccount and InterestAccount.

SpringAccountApplicationController.java: Additional controller to handle basic HTTP requests.

Getting Started

Prerequisites:
Java 8 or higher
Maven
Spring Boot

Running the Application
Once the application is running, you can access it via the following endpoints:

Welcome Page: http://localhost:8080/
Main Outputs: http://localhost:8080/main
Spring Account Application Page: http://localhost:8080/SpringAccountApplication

Example Operations
The AccountController demonstrates various operations on ChequeAccount and InterestAccount.

ChequeAccount Operations:

Create a ChequeAccount with a balance of 1000 and an overdraft limit of 200.
Credit 500 to the account.
Attempt to debit 800 from the account and check the updated balance.
InterestAccount Operations:

Create an InterestAccount with a balance of 10000 and a monthly interest rate of 0.25%.
Add monthly interest to the account.
Update the interest rate to 0.1% and add monthly interest again.
