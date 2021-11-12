# Lecture6Project

I have modified existing project from Practice5. This project utilizes an in-memory databases H2 for storing and working with my databases, containing two tables: Product and Client. 
I have created controllers for Product and Client table using @RestController, where I have implemented Rest API and http methods. JUnit tests for Product and Client service and controllers were created/updated.

In this project, several changes and improvements have been introduced:

First, I have practice new features of Java 8 (Stream API, Optional and LocalDate) in PracticeJava8Features class using Car entity. JUnit tests for each method were done.

Secondly, I analyzed my project with Sonarlind plugin and I have done many minor changes and all the issues was resolved. 

Moreover, I have added Lombok annotations for my entity classes, controllers. Lombok is really convenient tool that makes code clear and easier.

I have read about design patterns. Builder pattern have been implemented in the practice1, when project data was not linked to H2 database. But now I have used DBInit class for initiating some data using @PostConstruct, so using builder pattern is not relevant for this practice. Singleton pattern was already implemented when accessing database using dataSource

Finally, I have done several optimizations to my code, such as extraction of methods to make code clean. For example, in @RestLog annotation class I extracted getRequestType() method and logIPAddress() in controllers. 




