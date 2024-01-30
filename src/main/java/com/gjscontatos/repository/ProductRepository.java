package com.gjscontatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjscontatos.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
