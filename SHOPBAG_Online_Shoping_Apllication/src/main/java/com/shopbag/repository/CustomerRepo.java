package com.shopbag.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopbag.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {

	List<Customer> viewAllCustomer(String location);
	
}
