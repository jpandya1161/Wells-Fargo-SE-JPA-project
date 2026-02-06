# Wells Fargo Software Engineering Virtual Experience - Task 2

This repository contains the completion of Task 2 for the Wells Fargo Software Engineering Virtual Experience on Forage. The goal of this task was to design and implement a relational data model for a financial advising tool using Spring Data JPA.

## 📌 Project Overview
The objective was to extend a baseline Spring Boot application by creating an Entity-Relationship (ER) model that connects Advisors to their Clients and manages their Portfolios and associated Securities.

## 🛠️ Technical Implementation
I implemented a four-tier hierarchical data model using **Jakarta Persistence (JPA)**:

* **Advisor**: The primary entity representing the financial counselor.
* **Client**: Linked to an Advisor via a `Many-to-One` relationship.
* **Portfolio**: Linked to a Client via a `Many-to-One` relationship.
* **Security**: Linked to a Portfolio via a `Many-to-One` relationship, allowing a portfolio to hold multiple financial assets.

### Key Features Included:
- **Relational Mapping**: Utilized `@ManyToOne` and `@JoinColumn` for strict database constraints.
- **Immutability**: Implemented `updatable = false` on creation and purchase dates to ensure historical data integrity.
- **Modern Java Time API**: Used `LocalDate` for all date-based fields to ensure precision and compatibility.
- **Data Encapsulation**: Followed Java best practices with protected constructors for JPA and clean getters/setters.

![Wells Fargo ERD](https://github.com/user-attachments/assets/1fe23606-d0a8-451f-816a-98b31d4883e3)
