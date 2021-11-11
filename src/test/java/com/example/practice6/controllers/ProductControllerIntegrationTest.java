package com.example.practice6.controllers;

import com.example.practice6.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductControllerIntegrationTest {


    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void testFindProductById() {
        ResponseEntity<Product> response = testRestTemplate.getForEntity("/products/1", Product.class);

        assertEquals(1, response.getBody().getId());
        assertEquals("MacBook Pro", response.getBody().getProductName());
        assertEquals(900000, response.getBody().getProductPrice());
        assertEquals(10, response.getBody().getProductQuantity());
    }

    @Test
     void testCreateProduct(){

        Product product = new Product();
        product.setProductName("AirPods");
        product.setProductPrice(100000);
        product.setProductQuantity(6);

        HttpEntity<Product> request = new HttpEntity<>(product);

        ResponseEntity<Product> response = testRestTemplate.postForEntity("/products", request, Product.class);

        assertNotNull(response.getBody().getId());
        assertEquals("AirPods", response.getBody().getProductName());
        assertEquals(100000, response.getBody().getProductPrice());
        assertEquals(6, response.getBody().getProductQuantity());
    }
}
