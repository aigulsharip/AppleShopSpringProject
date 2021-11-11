package com.example.practice6.controllers;

import com.example.practice6.entity.Client;
import com.example.practice6.entity.Product;
import com.example.practice6.service.ClientService;
import com.example.practice6.service.ProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ClientController.class)
class ClientControllerTest {
    @Autowired
    private ClientController clientController;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ClientService clientService;



    @Test
    void testGetClientById() throws Exception {
        Client client = new Client();
        client.setClientName("Richard");
        client.setClientEmail("richard@gmail.com");

        when(clientService.findById(anyLong())).thenReturn(client);

        mockMvc.perform(MockMvcRequestBuilders.get("/clients/1"))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.jsonPath("$.clientName").value("Richard"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.clientEmail").value("richard@gmail.com"))
                .andExpect(status().isOk());

    }

    @Test
    void testCreateNewClient() throws Exception {

        Client client = new Client();
        client.setId(1L);
        client.setClientName("Richard");
        client.setClientEmail("richard@gmail.com");

        when(clientService.createClient(any(Client.class))).thenReturn(client);

        mockMvc.perform(MockMvcRequestBuilders.post("/clients").
                        content(new ObjectMapper().writeValueAsString(client)).
                        contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.clientName").value("Richard"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.clientEmail").value("richard@gmail.com"));
    }

    @Test
    void testDelete() throws Exception {
        mockMvc.perform( MockMvcRequestBuilders.delete("/clients/{id}", 1) )
                .andExpect(status().isOk());
    }

    /*
    @Test
    void testGetClients() {
        when(clientService.findAll()).thenReturn(Arrays.<Client>asList(new Client(Long.valueOf(1), "clientName", "clientEmail")));

        List<Client> result = clientController.getClients(null);
        Assertions.assertEquals(Arrays.<Client>asList(new Client(Long.valueOf(1), "clientName", "clientEmail")), result);
    }

     */

}
//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme