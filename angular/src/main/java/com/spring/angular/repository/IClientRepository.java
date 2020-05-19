package com.spring.angular.repository;

import com.spring.angular.model.ntt_dat_clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<ntt_dat_clients, Integer> {



}