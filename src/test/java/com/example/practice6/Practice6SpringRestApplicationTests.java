package com.example.practice6;

import com.example.practice6.controllers.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class Practice6SpringRestApplicationTests {
    @Autowired
    ProductController productController;

    @Test
    void contextLoader() {
        assertThat(productController).isNotNull();
    }



}
