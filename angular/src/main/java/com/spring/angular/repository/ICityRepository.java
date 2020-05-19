package com.spring.angular.repository;

import com.spring.angular.model.ntt_dat_city;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface ICityRepository extends JpaRepository<ntt_dat_city, Integer> {



}
