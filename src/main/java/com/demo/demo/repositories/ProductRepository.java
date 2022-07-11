package com.demo.demo.repositories;

import com.demo.demo.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
