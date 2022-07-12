package com.demo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
