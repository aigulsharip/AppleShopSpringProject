package com.example.practice6.service;

import com.example.practice6.entity.Client;
import com.example.practice6.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DBInitClient {

    @Autowired
    ClientRepository clientRepository;

    @PostConstruct
    public void initClientTable() {
        Client client = new Client();
        client.setClientName("Peter");
        client.setClientEmail("peter@gmail.com");
        clientRepository.save(client);

        Client client2 = new Client();
        client2.setClientName("Sara");
        client2.setClientEmail("sara@gmail.com");
        clientRepository.save(client2);

        Client client3 = new Client();
        client3.setClientName("Bob");
        client3.setClientEmail("bob@gmail.com");
        clientRepository.save(client3);

        Client client4 = new Client();
        client4.setClientName("Tom");
        client4.setClientEmail("tom@gmail.com");
        clientRepository.save(client4);

        Client client5 = new Client();
        client5.setClientName("Anna");
        client5.setClientEmail("anna@gmail.com");
        clientRepository.save(client5);

        Client client6 = new Client();
        client6.setClientName("Susanna");
        client6.setClientEmail("susanna@gmail.com");
        clientRepository.save(client6);



    }
}
