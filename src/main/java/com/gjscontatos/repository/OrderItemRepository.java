package com.gjscontatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjscontatos.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
