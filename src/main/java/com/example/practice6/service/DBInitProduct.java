package com.example.practice6.service;

import com.example.practice6.entity.Product;
import com.example.practice6.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DBInitProduct {

    @Autowired
    ProductRepository productRepository;

    @PostConstruct
    public void initProductTable() {

        Product product = new Product();
        product.setProductName("MacBook Pro");
        product.setProductPrice(900000);
        product.setProductQuantity(10);
        productRepository.save(product);

        Product product2 = new Product();
        product2.setProductName("Apple Watch");
        product2.setProductPrice(450000);
        product2.setProductQuantity(20);
        productRepository.save(product2);


        Product product3 = new Product();
        product3.setProductName("IPhone 12");
        product3.setProductPrice(600000);
        product3.setProductQuantity(8);
        productRepository.save(product3);

        Product product4 = new Product();
        product4.setProductName("IPad Pro");
        product4.setProductPrice(200000);
        product4.setProductQuantity(9);
        productRepository.save(product4);

        Product product5 = new Product();
        product5.setProductName("AirPods");
        product5.setProductPrice(160000);
        product5.setProductQuantity(7);
        productRepository.save(product5);



    }
}
