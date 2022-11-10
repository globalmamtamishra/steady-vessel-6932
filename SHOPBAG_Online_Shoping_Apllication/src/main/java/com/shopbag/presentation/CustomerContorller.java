package com.shopbag.presentation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopbag.exception.CustomerException;
import com.shopbag.model.Customer;
import com.shopbag.service.CustomerServiceImpl;


@RestController
public class CustomerContorller {

	@Autowired
	private CustomerServiceImpl cImpl;
	
	@PostMapping("/saveCustomer")
	public ResponseEntity<Customer> addCustomerHandler(@RequestBody Customer cust) throws CustomerException{
		
		Customer saveCustomer = cImpl.addCustomer(cust);
		
		return new ResponseEntity<Customer>(saveCustomer, HttpStatus.CREATED);
	}
	
	
	@PutMapping("/updateCustomer")
	public ResponseEntity<Customer> updateCustomerHandler(@RequestBody Customer cust) throws CustomerException{
		
		Customer updateCustomer = cImpl.updateCustomer(cust);
		
		return new ResponseEntity<Customer>(updateCustomer, HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/deleteCustomer")
	public ResponseEntity<Customer> removeCustomerHandler(@RequestBody Customer cust) throws CustomerException{
		
		Customer removeCustomer = cImpl.removeCustomer(cust);
		
		return new ResponseEntity<Customer>(removeCustomer, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getCustomer")
	public ResponseEntity<Customer> viewCustomerHandler(@PathVariable Customer cust) throws CustomerException{
		
		Customer viewCustomer = cImpl.viewCustomer(cust);
		
		return new ResponseEntity<Customer>(viewCustomer, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getAllCustomer/{location}")
	public ResponseEntity<List<Customer>> viewAllCustomerHandler(@PathVariable String location )throws CustomerException{
		
		List<Customer> viewAllCustomer = cImpl.viewAllCustomer(location);
		
		return new ResponseEntity<List<Customer>>(viewAllCustomer, HttpStatus.CREATED);
	}
	
	
	
}



































