package com.example.lecture1project.database;

import java.util.ArrayList;
import java.util.List;

// This Product class intended for creating of list of Products
public class Product {

    private int id;
    private String productName;
    private int productPrice;
    private int productQuantity;


    public Product(int id, String productName, int productPrice, int productQuantity) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public static List<Product> getItems() {
        List<Product> shop = new ArrayList<>();

        shop.add(new Product(++idCounter, "MacBook Pro", 900000, 10));
        shop.add(new Product(++idCounter, "IPhone 12", 600000, 8));
        shop.add(new Product(++idCounter, "IPad Pro", 200000, 3));
        shop.add(new Product(++idCounter, "Apple Watch", 4500000, 9));
        shop.add(new Product(++idCounter, "AirPods", 160000, 7));

        return shop;
    }


    public String toString() {
        return "Id: " + id + " Item: " + productName + " Price: " + productPrice + " KZT Quantity: " + productQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return productName;
    }

    public void setItemName(String productName) {
        this.productName = productName;
    }

    public double getItemPrice() {
        return productPrice;
    }

    public void setItemPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getItemQuantity() {
        return productQuantity;
    }

    public void setItemQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    private static int idCounter;




}
