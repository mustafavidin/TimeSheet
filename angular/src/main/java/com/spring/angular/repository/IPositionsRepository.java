package com.spring.angular.repository;

import com.spring.angular.model.Positions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IPositionsRepository extends JpaRepository<Positions, Integer> {


}

