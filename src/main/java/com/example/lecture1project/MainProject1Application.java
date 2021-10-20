package com.example.lecture1project;

import com.example.lecture1project.service.AppleShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainProject1Application {

    private static AppleShopService service;


    @Autowired
    public void setService(AppleShopService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainProject1Application.class, args);

        // Printing the list of all/filtered products --- Please select necessary implementation of ProductsRepository
        System.out.println("Printing the list of products");
        System.out.println("The list is raw or filtered by price");
        service.getAllProducts().forEach(System.out::println);
        System.out.println();

        // Printing the list of all/filtered clients
        System.out.println("Printing the list of clients");
        System.out.println("The list is sorted by age (ascending)");
        service.getAllClients().forEach(System.out::println);
        System.out.println();

        // Printing the list of all(filtered) tasks or services
        System.out.println("Printing the list of services provided by shop");
        System.out.println("The list is sorted by name of task alphabetically");
        service.getAllTasks().forEach(System.out::println);


    }

}
