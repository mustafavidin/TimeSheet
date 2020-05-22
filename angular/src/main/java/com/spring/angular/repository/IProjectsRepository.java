package com.spring.angular.repository;

import com.spring.angular.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IProjectsRepository extends JpaRepository<Projects, Integer> {


}
