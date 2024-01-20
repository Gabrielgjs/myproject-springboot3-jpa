package com.gjscontatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjscontatos.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
