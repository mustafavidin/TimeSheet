package com.spring.angular.repository;

import com.spring.angular.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IUsersRepository extends JpaRepository<Users, Integer> {




}