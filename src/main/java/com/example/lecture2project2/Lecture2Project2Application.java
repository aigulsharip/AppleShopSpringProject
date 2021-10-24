package com.example.lecture2project2;

import com.example.lecture2project2.dao.ProductDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class Lecture2Project2Application {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(Lecture2Project2Application.class, args);

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:SpringXMLConfig/embedded-h2-config.xml");
        context.refresh();


        ProductDAO productDAO = context.getBean(ProductDAO.class);

        System.out.println("The name of product with 1st ID " +
                productDAO.findProductById(1));

        String client = "Peter";
        System.out.println(client + " submitted * " + productDAO.findProductByClientName("Peter") + " * for repair or other service");

        String client2 = "Bob";
        System.out.println("Email of address of " + client2 + " is: " + productDAO.findEmailOfClient(client2));

        context.close();

    }
}
