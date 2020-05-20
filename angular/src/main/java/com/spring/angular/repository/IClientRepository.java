package com.spring.angular.repository;

import com.spring.angular.model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Clients, Integer> {

}