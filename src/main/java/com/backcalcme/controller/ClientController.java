package com.backcalcme.controller;


import com.backcalcme.dto.ClientDTO;
import com.backcalcme.model.Client;
import com.backcalcme.repository.ClientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/")
@RestController

public class ClientController {

    private ClientRepository clientrep;


    public ClientController(ClientRepository clientrep) {
        this.clientrep = clientrep;
    }


    @GetMapping
    private List<Client> ListClient(){

        return this.clientrep.findAll();

    }

    @PostMapping
    private Client Cadastrar(@RequestBody ClientDTO clientDTO){

            Client newClient = clientDTO.converter();

        return this.clientrep.save(newClient) ;
    }

}
