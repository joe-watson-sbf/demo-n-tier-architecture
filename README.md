# Library Demo - N Tier Architecture

## Sure, here is an example implementation of a library application 
using N-tier architecture using Spring Boot with Java:

# Overview 

### This library application consists of three layers:

- Presentation layer (UI) 
        
        Handles user interface (UI) logic, interacts with the user,
        and sends requests to the application layer for processing. 

- Application layer (Service) 

      Handles business logic and is responsible for processing
      requests from the presentation layer. It interacts with the 
      data access layer to perform CRUD (Create, Read, Update, Delete) 
      operations on the data.

- Data access layer (DAO)

      Handles data access and storage. It interacts with the
      database and performs CRUD operations


## Prerequisites
- Java 8 or higher 
- Spring Boot 2.4.4 or higher 
- Maven


## Dependencies
- H2
- JPA (Hibernate)
- Lombok