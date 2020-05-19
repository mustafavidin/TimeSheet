package com.spring.angular.repository;

import com.spring.angular.model.ntt_def_job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IJobRepository extends JpaRepository<ntt_def_job, Integer> {


}