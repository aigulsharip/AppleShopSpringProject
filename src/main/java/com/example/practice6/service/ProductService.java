package com.example.practice6.service;

import com.example.practice6.entity.Product;
import com.example.practice6.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }


    public Product findProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> findProducts() {
        return productRepository.findAll();
    }

    public String deleteProductById(Long id) {
        productRepository.deleteById(id);
        return "Product got deleted";
    }



}

