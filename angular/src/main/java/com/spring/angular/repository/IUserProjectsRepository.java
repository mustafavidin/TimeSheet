package com.spring.angular.repository;

import com.spring.angular.model.UserProjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IUserProjectsRepository extends JpaRepository<UserProjects, Integer> {

    List<UserProjects> findByProjectCode(int projectCode);
    List<UserProjects> removeByProjectCode(int projectCode);
}