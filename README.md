# Lecture2Project

In this project, I have modified existing project from Lecture1. I have added one-to-many relationship that was lacking in previous version of project. 

This project utilizes an In-memory databases H2 for storing and working with my databases, containing three tables: Product, Client and Service. JDBC template have been used to connect and work with database. I have used examples from Chapter 7 of Pro Spring 5 for making configuration of JDBC and connecting to H2 database. Connecting to H2 console was relatively easy, but configurating JDBC template and working with it required some time and effort. 

Another task for this practice was the addition of AOP configuration and implementation of different advices. I have made AOP configuration using Java annotations, more specifically, added @EnableAspectJAutoProxy and  @ComponentScan annotation to Java config file. Also, created Aspect class containing advices and poincuts. I have implemented before and after advices for 2 methods in TestingJDBCAndAOP class.

