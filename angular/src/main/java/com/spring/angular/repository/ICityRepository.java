package com.spring.angular.repository;

import com.spring.angular.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface ICityRepository extends JpaRepository<City, Integer> {



}
