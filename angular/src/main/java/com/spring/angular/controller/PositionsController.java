package com.spring.angular.controller;


import com.spring.angular.model.Positions;
import com.spring.angular.repository.IPositionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class PositionsController {
    @Autowired
    private IPositionsRepository positionsRepository;


    @GetMapping("/positions")
    public List<Positions> usersList()
    {
        return  positionsRepository.findAll();

    }



}
