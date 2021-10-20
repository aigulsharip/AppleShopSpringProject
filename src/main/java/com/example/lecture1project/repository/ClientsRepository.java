package com.example.lecture1project.repository;

import com.example.lecture1project.database.Client;

import java.util.List;

public interface ClientsRepository {
    public List<Client> findClients();
}
