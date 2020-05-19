package com.spring.angular.controller;


import com.spring.angular.model.ntt_def_positions;
import com.spring.angular.repository.ICityRepository;
import com.spring.angular.repository.IPositionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class PositionsController {
    @Autowired
    private IPositionsRepository positionsRepository;


    @GetMapping("/positions")
    public List<ntt_def_positions> usersList()
    {
        return  positionsRepository.findAll();

    }



}
