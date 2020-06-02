package com.spring.angular.controller;

import com.spring.angular.model.UserProjects;
import com.spring.angular.repository.IUserProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class UserProjectsController {

    @Autowired
    private IUserProjectsRepository userProjectsRepository;


    @GetMapping("/user-projects")
    public List<UserProjects> userProjectsList()
    {
        return  userProjectsRepository.findAll();
    }

    @PostMapping(value ="/user-projects")
    public UserProjects add(@RequestBody UserProjects userProjects)
    {
        return userProjectsRepository.save(userProjects);
    }

    @DeleteMapping(path = {"/user-projects/{id}"})
    public Optional<UserProjects> deleteUserProject(@PathVariable("id")int id)
    {
        Optional<UserProjects> userProject = GetUserProjectById(id);
        if (userProject != null) {
            userProjectsRepository.deleteById(id);
        }
        return userProject;
    }

    @GetMapping(value ="/user-projects/{id}")
    public Optional<UserProjects> GetUserProjectById(@PathVariable("id") int id)
    {
        return userProjectsRepository.findById(id);
    }

}
