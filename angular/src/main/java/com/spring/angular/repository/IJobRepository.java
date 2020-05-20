package com.spring.angular.repository;

import com.spring.angular.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IJobRepository extends JpaRepository<Jobs, Integer> {


}