package com.shopbag.service;

import org.springframework.stereotype.Service;

import com.shopbag.exception.CartException;
import com.shopbag.model.Cart;
import com.shopbag.model.Product;
import com.shopbag.repository.CartRepo;

@Service
public class CartServiceImpl implements CartService {
	
	private CartRepo cartRepo;

	@Override
	public Cart addProductToCart(Cart cart, Product product, Integer quantity) throws CartException {
		
		cartRepo.

	}

	@Override
	public Cart removeProductFromCart(Cart cart, Product product) throws CartException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart updateProductQuantity(Cart cart, Product product, Integer quantity) throws CartException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart removeAllProducts(Cart cart) throws CartException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart viewAllProducts(Cart cart) throws CartException {
		// TODO Auto-generated method stub
		return null;
	}

}
