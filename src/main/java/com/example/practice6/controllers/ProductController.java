package com.example.practice6.controllers;

import com.example.practice6.aop.RestLog;
import com.example.practice6.entity.Product;
import com.example.practice6.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RestLog(uri = "http://localhost:8080/products")
    @GetMapping()
    public List<Product> getProducts(HttpServletRequest request) {
        logIPAddress(request);
        return productService.findProducts();
    }

    @RestLog (uri = "http://localhost:8080/products/{id}")
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id, HttpServletRequest request) {
        logIPAddress(request);

        return productService.findProductById(id);
    }

    @RestLog (uri = "http://localhost:8080/products")
    @PostMapping
    public Product createProduct(@RequestBody Product product, HttpServletRequest request) {
        logIPAddress(request);
        return productService.createProduct(product);
    }


    @RestLog (uri = "http://localhost:8080/products/{id}")
    @PutMapping(value="/{id}")
    public void updateProduct(@RequestBody Product product,
                       @PathVariable Long id, HttpServletRequest request) {
        logIPAddress(request);
        productService.createProduct(product);

    }

    @RestLog (uri = "http://localhost:8080/products/{id}")
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id, HttpServletRequest request) {
        logIPAddress(request);
        return productService.deleteProductById(id);
    }

    // This method for outputting IP address of request
    public void logIPAddress(HttpServletRequest request) {
        log.info("IP address of request:  {}", request.getRemoteAddr());
    }


}
