package com.spring.angular.repository;

import com.spring.angular.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IDistrictRepository extends JpaRepository<District, Integer> {


}
