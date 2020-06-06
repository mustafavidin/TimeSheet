package com.spring.angular.controller;

import com.spring.angular.model.UserProjects;
import com.spring.angular.repository.IUserProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping({"/api"})
@Transactional
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

    @DeleteMapping(path = {"/user-projects/{projectCode}"})
    public List<UserProjects> deleteUserProject(@PathVariable("projectCode")int projectCode)
    {
        List<UserProjects> userProject = GetUserProjectByProjectCode(projectCode);
        if (userProject != null) {
        userProjectsRepository.removeByProjectCode(projectCode);
    }
        return userProject;
    }

    @GetMapping(value ="/user-projects/{projectCode}")
    public List<UserProjects> GetUserProjectByProjectCode(@PathVariable("projectCode") int projectCode)
    {
        return userProjectsRepository.findByProjectCode(projectCode);
    }

}
