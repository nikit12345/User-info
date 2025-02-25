package com.microservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{

}
