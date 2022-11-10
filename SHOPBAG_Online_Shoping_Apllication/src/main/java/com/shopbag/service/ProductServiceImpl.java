package com.shopbag.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shopbag.exception.ProductException;
import com.shopbag.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public List<Product> viewAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product addProduct(Product pdt) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product viewProduct(Integer Id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> viewProductByCategory(String cname) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product removeProduct(Integer Id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

}
