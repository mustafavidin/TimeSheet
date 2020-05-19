package com.spring.angular.repository;

import com.spring.angular.model.ntt_dat_district;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface IDistrictRepository extends JpaRepository<ntt_dat_district, Integer> {


}
