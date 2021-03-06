package com.example.lecture1project.database;

import java.util.ArrayList;
import java.util.List;

// This Service is intended for creating the list of services provided by shop
public class Service {
    private String task;
    private String product;
    private int cost;


    public Service(String task, String product, int cost) {
        this.task = task;
        this.product = product;
        this.cost = cost;
    }

    public static List<Service> getTasks() {

        List<Service> services = new ArrayList<>();

        services.add(new Service("Repair MacBook Pro Screen", "Bob", 20000));
        services.add(new Service("Install necessary software", "Sara", 10000));
        services.add(new Service("Update settings", "Anna", 15000));

        return services;

    }

    @Override
    public String toString() {
        return "Task{" +
                "task='" + task + '\'' +
                ", customer='" + product + '\'' +
                ", cost=" + cost +
                " KZT }";
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getCustomer() {
        return product;
    }

    public void setCustomer(String customer) {
        this.product = customer;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


}
