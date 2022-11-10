package com.shopbag.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopbag.exception.CustomerException;
import com.shopbag.model.Customer;
import com.shopbag.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo cRepo;
	
	@Override
	public Customer addCustomer(Customer cust) throws CustomerException {
		
		Optional<Customer> optional = cRepo.findById(cust.getCustomerId());
		
		if(optional.isPresent()) {
			throw new CustomerException("Customer already exists...");
		}
		
		return cRepo.save(cust);
		
		
	}

	@Override
	public Customer updateCustomer(Customer cust) throws CustomerException {
		
		Optional<Customer> optional = cRepo.findById(cust.getCustomerId());
		
		if(!optional.isPresent()) {
			throw new CustomerException("Customer not found with this customerId "+cust.getCustomerId());
		}
		
		return cRepo.save(cust);
		
	}

	@Override
	public Customer removeCustomer(Customer cust) throws CustomerException {
		
		Customer customer = cRepo.findById(cust.getCustomerId()).orElseThrow(()-> new CustomerException("Customer not found with this customerId "+cust.getCustomerId()));
		
		cRepo.delete(cust);
		
		return customer;
		
	}

	@Override
	public Customer viewCustomer(Customer cust) throws CustomerException {
		
		Optional<Customer> custOpt = cRepo.findById(cust.getCustomerId());
		
		if(custOpt.isPresent())
			return custOpt.get();
		
		else
			throw new CustomerException("Customer not found with this customerId "+cust.getCustomerId());
	}

	@Override
	public List<Customer> viewAllCustomer(String location) throws CustomerException {
		
		List<Customer> list = cRepo.viewAllCustomer(location);
		
		if(list.isEmpty())
			throw new CustomerException("Customer not found with this location: "+location);
		
		return list;
	}

	
	
}
