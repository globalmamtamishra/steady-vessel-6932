package com.shopbag.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopbag.model.Address;
import com.shopbag.model.Customer;

@Repository
public interface AddressDao extends JpaRepository<Address,Integer> {

	List<Customer> findByLocation(String location);
	
}
