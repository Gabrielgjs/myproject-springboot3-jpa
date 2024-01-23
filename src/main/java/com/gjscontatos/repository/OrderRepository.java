package com.gjscontatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjscontatos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
