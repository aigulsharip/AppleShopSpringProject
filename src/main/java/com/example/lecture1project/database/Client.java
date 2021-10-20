package com.example.lecture1project.database;

import java.util.ArrayList;
import java.util.List;

// This class is intended for creating of list of clients/customers
public class Client {

    private String name;
    private String email;
    private int age;
    private String product;


    public Client(String name, int age, String email, String product) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.product = product;
    }

    public static List<Client> getClients() {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Bob", 34, "bob@gmail.com", "MacBook Pro"));
        clients.add(new Client("Tom", 23, "tom@gmail.com", "IPhone 12"));
        clients.add(new Client("Anna", 27, "anna@gmail.com", "AirPods"));
        clients.add(new Client("Sara", 19, "sara@gmail.com", "Apple Watch"));
        return clients;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", product='" + product + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }





}
