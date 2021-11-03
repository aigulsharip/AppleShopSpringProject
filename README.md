# Lecture#Project

In this project, I have modified existing project from Practice2.

This project utilizes an in-memory databases H2 for storing and working with my databases, containing two tables: Product and Client. JDBC template was changed to Hibernate and JPA. For Product table,
I used JPA for implementation of methods. For Client table, I added JPA repository (ClientRepository) and used for it for accessing table and implementing some methods. I added transaction managent to Client and Product class by adding @Transactional to the service class and @EnableJpaRepositories on configuration class. Finally, I create ProductAndClientTest class that test all the methods in Client and Product service class and the coverage is 100%.

