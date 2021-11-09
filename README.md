# Lecture5Project

I have modified existing project from Practice4. This project utilizes an in-memory databases H2 for storing and working with my databases, containing two tables: Product and Client. 
In this project, I have created controllers for Product and Client table using @RestController, where I have implemented basic Rest API and http methods.

Logging AOP was added to controllers for displaying request details (url, ip address and request type) using created @RestLog annotation and in-build methods of HttpServletRequest.

In this project, I have wrote Junit tests for ProductService. Also, JUnit tests and Integration test was written for Product controller. 

I have implemented web security for ClientControllers in practice5security branch



