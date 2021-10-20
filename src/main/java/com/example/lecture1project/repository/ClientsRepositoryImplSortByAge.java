package com.example.lecture1project.repository;

import com.example.lecture1project.database.Client;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;


@Repository
// As we have only one implementation of ClientsRepository, we don't need @Primary
public class ClientsRepositoryImplSortByAge implements ClientsRepository{
    @Override
    public List<Client> findClients() {
        return Client.getClients().stream().sorted(((o1, o2) -> o1.getAge()- o2.getAge())).collect(Collectors.toList());
    }
}
