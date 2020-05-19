package com.spring.angular.repository;

import com.spring.angular.model.ntt_dat_district;
import com.spring.angular.model.ntt_dat_users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface IUsersRepository extends JpaRepository<ntt_dat_users, Integer> {




}