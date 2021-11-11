package com.example.practice6.service;

import com.example.practice6.entity.Client;
import com.example.practice6.entity.Product;
import com.example.practice6.repository.ClientRepository;
import com.example.practice6.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ClientServiceTest {

    @Autowired
    private ClientService clientService;

    @MockBean
    private ClientRepository clientRepository;



    @Test
    void testCreateClient() {
        Client client = new Client();
        client.setClientName("Richard");
        client.setClientEmail("richard@gmail.com");

        when(clientRepository.save(client)).thenReturn(client);
        assertEquals(client,clientService.createClient(client));
    }

    @Test
    void testFindById() {
        Long id = 1L;

        Client client = new Client();
        client.setClientName("Richard");
        client.setClientEmail("richard@gmail.com");

        when(clientRepository.findById(id)).thenReturn(Optional.of(client));
        assertEquals(client, clientService.findById(id));
    }

    @Test
    void testFindAll() {
        Client client = new Client();
        client.setClientName("Richard");
        client.setClientEmail("richard@gmail.com");


        Client client2 = new Client();
        client2.setClientName("Tim");
        client2.setClientEmail("tim@gmail.com");

        when(clientRepository.findAll()).thenReturn(Stream
                .of(client, client2).collect(Collectors.toList()));
        assertEquals(2, clientService.findAll().size());

    }

    @Test
    void testDelete() {
        Long id = 1L;
        clientService.delete(id);
        verify(clientRepository, times(1)).deleteById(id);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme