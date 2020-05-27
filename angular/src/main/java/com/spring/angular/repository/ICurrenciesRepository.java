package com.spring.angular.repository;

import com.spring.angular.model.Currencies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ICurrenciesRepository extends JpaRepository<Currencies, Integer> {


}

