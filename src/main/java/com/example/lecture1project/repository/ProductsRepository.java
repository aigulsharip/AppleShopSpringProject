package com.example.lecture1project.repository;

import com.example.lecture1project.database.Product;

import java.util.List;

public interface ProductsRepository {
    List<Product> findProducts();
}


