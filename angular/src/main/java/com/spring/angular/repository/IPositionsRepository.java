package com.spring.angular.repository;

import com.spring.angular.model.ntt_def_positions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IPositionsRepository extends JpaRepository<ntt_def_positions, Integer> {


}

