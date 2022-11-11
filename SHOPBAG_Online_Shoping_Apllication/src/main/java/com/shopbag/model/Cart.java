package com.shopbag.model;

import java.util.Map;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String cartId;
	
//	@NotNull(message = "Customer details cannot be left blank")
	@Embedded
	private Customer cutomer;
	
//	@NotNull(message = "Please select atleast one product")
	private Map<Integer, Product> products;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(String cartId, Customer cutomer, Map<Integer, Product> products) {
		super();
		this.cartId = cartId;
		this.cutomer = cutomer;
		this.products = products;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public Customer getCutomer() {
		return cutomer;
	}

	public void setCutomer(Customer cutomer) {
		this.cutomer = cutomer;
	}

	public Map<Integer, Product> getProducts() {
		return products;
	}

	public void setProducts(Map<Integer, Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cutomer=" + cutomer + ", products=" + products + "]";
	}
	
}
