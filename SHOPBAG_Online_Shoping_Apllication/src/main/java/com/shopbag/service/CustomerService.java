package com.shopbag.service;

import java.util.List;

import com.shopbag.exception.CustomerException;
import com.shopbag.model.Customer;

public interface CustomerService {

	Customer addCustomer(Customer cust) throws CustomerException;
	
	Customer updateCustomer(Customer cust) throws CustomerException;
	
	Customer removeCustomer(Customer cust) throws CustomerException;
	
	Customer viewCustomer(Customer cust) throws CustomerException;
	
	List<Customer> viewAllCustomer(String location) throws CustomerException;
	
	
}
