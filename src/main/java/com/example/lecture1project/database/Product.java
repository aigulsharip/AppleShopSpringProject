package com.example.lecture1project.database;

import java.util.ArrayList;
import java.util.List;

// This Product class intended for creating of list of Products
public class Product {

    private int id;
    private String itemName;
    private int itemPrice;
    private int itemQuantity;


    public Product(int id, String itemName, int itemPrice, int itemQuantity) {
        this.id = id;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
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
        return "Id: " + id + " Item: " + itemName + " Price: " + itemPrice + " KZT Quantity: " + itemQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    private static int idCounter;




}
