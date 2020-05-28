package com.spring.angular.controller;

import com.spring.angular.model.Projects;
import com.spring.angular.repository.IProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping({"/projects"})
public class ProjectsController {

    @Autowired
    private IProjectsRepository projectsRepository;

    @GetMapping("/all")
    public List<Projects> projectsList()
    {
        return  projectsRepository.findAll();
    }

    @PostMapping(value ="/all")
    public Projects add(@RequestBody Projects projects)
    {
        return projectsRepository.save(projects);
    }

    @GetMapping(value ="/all/{id}")
    public Optional<Projects> GetProjectsId(@PathVariable("id") Integer projectId)
    {
        return projectsRepository.findById(projectId);
    }

    @PutMapping(path = {"/all/{id}"})
    public Projects edit(@RequestBody Projects projects, @PathVariable("id") int projectId)
    {
        projects.setId(projectId);
        return projectsRepository.save(projects);
    }

    @DeleteMapping(path = {"/all/{id}"})
    public Optional<Projects> deleteProject(@PathVariable("id")int id)
    {
        Optional<Projects> project = GetProjectsId(id);
        if (project != null) {
            projectsRepository.deleteById(id);
        }
        return project;
    }

}
