package com.shopbag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopbag.model.Cart;

public interface CartRepo extends JpaRepository<Cart, String> {

}
