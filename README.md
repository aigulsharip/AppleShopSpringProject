# Lecture1Project

This Java project was created with support of Spring Framework. This is prototype of Apple shop, it contains three databases of products, clients and services (provided by shop). 

First, three databases was created and filled up with some information. These tables are linked by at least one column (product name), but their connections are implicit for now.

Then, 3 repository interfaces have been created for 3 DTO class and various implementation of interfaces was established. ProductsRepository have 2 implementation of interface, therefore, @Primary annotation should be used.

Later, AppleShopService class representing service class was created for working with our three repositories. As only one constructor might have @Autowired annotation, @Autowired will be switched on/off for relevant constructor 
and it is not convenient. Therefore, I have used setter-based injection of DI

Lastly, MainProject1Application class uses our service class and output selected database to console. Since I am using one service class, it is necessary to choose necassary implementation out of three, 
as we have only one Service class for three interfaces, I have decided to use setter-based injection of DI. The list of tables have been printed to console.

Editted from practice2 branch


