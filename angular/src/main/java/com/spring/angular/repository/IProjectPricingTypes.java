package com.spring.angular.repository;

import com.spring.angular.model.ProjectPricingTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IProjectPricingTypes extends JpaRepository<ProjectPricingTypes, Integer> {


}