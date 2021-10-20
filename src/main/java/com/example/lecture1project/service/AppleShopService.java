package com.example.lecture1project.service;

import com.example.lecture1project.database.Client;
import com.example.lecture1project.database.Product;
import com.example.lecture1project.database.Service;
import com.example.lecture1project.repository.ClientsRepository;
import com.example.lecture1project.repository.ProductsRepository;
import com.example.lecture1project.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

// This AppleShopService class are necessary for working with our three repositories.
// As only one constructor might have @Autowired annotation, @Autowired should be switched on/off for relevant constructor and it is not convenient.
// Therefore, I have used setter-based injection of DI

@org.springframework.stereotype.Service
public class AppleShopService {
    private ProductsRepository productsRepository;
    private ClientsRepository clientsRepository;
    private TasksRepository tasksRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Product> getAllProducts() {
        return productsRepository.findProducts();
    }

    @Autowired
    public void setClientsRepository(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }

    public List<Client> getAllClients() {
        return  clientsRepository.findClients();
    }

    @Autowired
    public void setTasksRepository(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }
    public List<Service> getAllTasks() {
        return tasksRepository.findTasks();
    }

}
