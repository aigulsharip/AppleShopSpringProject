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
        service.getAllProducts().forEach(System.out::println);

        // Printing the list of all/filtered clients
        //service.getAllClients().forEach(System.out::println);

        // Printing the list of all(filtered) tasks or services
        //service.getAllTasks().forEach(System.out::println);


    }

}
