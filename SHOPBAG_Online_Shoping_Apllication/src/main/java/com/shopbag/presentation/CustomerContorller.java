package com.shopbag.presentation;


import java.util.List;

import javax.validation.Valid;

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
	private CustomerServiceImpl cService;
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> addCustomerHandler( @RequestBody Customer cust) throws CustomerException{
		
		Customer saveCustomer = cService.addCustomer(cust);
		
		return new ResponseEntity<Customer>(saveCustomer, HttpStatus.CREATED);
	}
	
	
	@PutMapping("/customer/{key}")
	public ResponseEntity<Customer> updateCustomerHandler(@Valid @RequestBody Customer cust, @PathVariable String key) throws CustomerException{
		
		Customer updateCustomer = cService.updateCustomer(cust, key);
		
		return new ResponseEntity<Customer>(updateCustomer, HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/customers/{key}")
	public ResponseEntity<Customer> removeCustomerHandler(@RequestBody Customer cust, @PathVariable String key) throws CustomerException{
		
		Customer removeCustomer = cService.removeCustomer(cust, key);
		
		return new ResponseEntity<Customer>(removeCustomer, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/customers")
	public ResponseEntity<Customer> viewCustomerHandler(@PathVariable Customer cust) throws CustomerException{
		
		Customer viewCustomer = cService.viewCustomer(cust);
		
		return new ResponseEntity<Customer>(viewCustomer, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/customers/{location}")
	public ResponseEntity<List<Customer>> viewAllCustomerHandler(@PathVariable String location )throws CustomerException{
		
		List<Customer> viewAllCustomer = cService.viewAllCustomer(location);
		
		return new ResponseEntity<List<Customer>>(viewAllCustomer, HttpStatus.CREATED);
	}
	
	
	
}



































