package com.example.practice3jpa.kafka;

import com.example.practice3jpa.Practice3JpaApplication;
import com.example.practice3jpa.config.JpaConfig;
import com.example.practice3jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@Configuration
public class KafkaMainClass implements CommandLineRunner {

    private KafkaMessageSender kafkaMessageSender;

    @Override
    public void run(String... args) throws Exception {

        // Testing kafka sender
        kafkaMessageSender.sendMessage("Kafka installed on my computer");
        kafkaMessageSender.sendMessage("Kafka configuration done successfully");

        for(int i=0; i < 3; ++i) {
            kafkaMessageSender.sendMessage("Test message: " + i);
        }

        /*
        // Accessing data from our database using Kafka
        //ConfigurableApplicationContext context = SpringApplication.run(Practice3JpaApplication.class, args);
        //GenericApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);
        //ProductService productService = context.getBean(ProductService.class);
        //String productNameWithFirstID = productService.findProductById(1L).getProductName();
        kafkaMessageSender.sendMessage("The name of first product" + productNameWithFirstID);

        */
    }

    @Autowired
    public KafkaMainClass(KafkaMessageSender kafkaMessageSender){
        this.kafkaMessageSender = kafkaMessageSender;
    }
}