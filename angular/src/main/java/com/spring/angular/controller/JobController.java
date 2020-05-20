package com.spring.angular.controller;

import com.spring.angular.model.Jobs;
import com.spring.angular.repository.IJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class JobController {

    @Autowired
    private IJobRepository jobRepository;


    @GetMapping("/job")
    public List<Jobs> usersList()
    {
        return  jobRepository.findAll();

    }

}
