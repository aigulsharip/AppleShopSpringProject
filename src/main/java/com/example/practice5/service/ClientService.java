package com.example.practice5.service;

import com.example.practice5.entity.Client;
import com.example.practice5.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {

    private final ClientRepository clientRepository;


    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }


    public Client findById(Long id) {
        return clientRepository.findById(id).get();
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public String delete(Long id) {
        clientRepository.deleteById(id);
        return "Client got deleted";
    }

}
