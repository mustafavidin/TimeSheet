package com.spring.angular.controller;


import com.spring.angular.model.City;
import com.spring.angular.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class CityController {
    @Autowired
    private ICityRepository cityRepository;


    @GetMapping("/city")
    public List<City> cityList()
    {
        return  cityRepository.findAll();

    }

}
