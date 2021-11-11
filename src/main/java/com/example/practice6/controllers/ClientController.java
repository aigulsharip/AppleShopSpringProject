package com.example.practice6.controllers;

import com.example.practice6.aop.RestLog;
import com.example.practice6.entity.Client;
import com.example.practice6.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @RestLog(uri = "http://localhost:8080/clients")
    @GetMapping()
    public List<Client> getClients(HttpServletRequest request) {
        logIPAddress(request);
        return clientService.findAll();
    }

    @RestLog(uri = "http://localhost:8080/clients/{id}")
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id, HttpServletRequest request) {
        return clientService.findById(id);
    }

    @RestLog(uri = "http://localhost:8080/clients")
    @PostMapping
    public Client createNewClient(@RequestBody Client client, HttpServletRequest request) {
        logIPAddress(request);
        return clientService.createClient(client);
    }

    @RestLog(uri = "http://localhost:8080/clients/{id}")
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id, HttpServletRequest request) {
        logIPAddress(request);
        return clientService.delete(id);
    }

    // This method for outputting IP address of request
    public void logIPAddress(HttpServletRequest request) {
        log.info("IP address of request:  {}", request.getRemoteAddr());
    }

}
