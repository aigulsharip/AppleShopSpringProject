package com.example.lecture1project.repository;

import com.example.lecture1project.database.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
// we need to uncomment @Primary when we need to select this implementation of ProductsRepository
//@Primary

public class ProductsRepositoryImplFilterByPrice implements ProductsRepository {
    @Override
    public List<Product> findProducts() {
        return Product.getItems().stream().filter(item -> item.getItemPrice() > 200000).collect(Collectors.toList());

    }
}
