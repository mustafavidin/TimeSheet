package com.spring.angular.repository;

import com.spring.angular.model.ProjectStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IProjectStatus extends JpaRepository<ProjectStatus, Integer> {


}