package com.spring.angular.controller;

import com.spring.angular.model.Currencies;
import com.spring.angular.repository.ICurrenciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class CurrencyController {

    @Autowired
    private ICurrenciesRepository currenciesRepository;

    @GetMapping("/currencies")
    public List<Currencies> currencyList()
    {
        return  currenciesRepository.findAll();
    }
}
