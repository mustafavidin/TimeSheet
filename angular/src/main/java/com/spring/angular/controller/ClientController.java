package com.spring.angular.controller;


import com.spring.angular.model.ntt_dat_clients;
import com.spring.angular.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/clients"})
public class ClientController {

    @Autowired
    private IClientRepository clientRepository;

    @GetMapping("/all")
    public List<ntt_dat_clients> usersList()
    {
        return  clientRepository.findAll();

    }
}
