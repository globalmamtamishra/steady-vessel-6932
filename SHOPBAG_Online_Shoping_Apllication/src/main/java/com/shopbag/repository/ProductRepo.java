package com.shopbag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopbag.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
