package com.example.lecture2project2.database;

// This Service is intended for creating the list of services provided by shop
public class Service {
    private String task;
    private String product;
    private String client;
    private int cost;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Service{" +
                "task='" + task + '\'' +
                ", product='" + product + '\'' +
                ", client='" + client + '\'' +
                ", cost=" + cost +
                '}';
    }
}
