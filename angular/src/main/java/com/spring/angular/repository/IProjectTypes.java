package com.spring.angular.repository;

import com.spring.angular.model.ProjectTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IProjectTypes extends JpaRepository<ProjectTypes, Integer> {


}