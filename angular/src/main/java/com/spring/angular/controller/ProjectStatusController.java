package com.spring.angular.controller;

import com.spring.angular.model.ProjectStatus;
import com.spring.angular.repository.IProjectStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/projects"})
public class ProjectStatusController {

    @Autowired
    private IProjectStatus repo;

    @GetMapping("/project-status")
    public List<ProjectStatus> projectStatus()
    {
        return  repo.findAll();
    }
}
