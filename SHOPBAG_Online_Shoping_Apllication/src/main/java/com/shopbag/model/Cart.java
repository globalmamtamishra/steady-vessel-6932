package com.shopbag.model;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull; 

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String cartId;
	
//	@NotNull(message = "Customer details cannot be left blank")
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;
	
//	@NotNull(message = "Please select atleast one product")
//	@JoinColumn(name = "")
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
	private List<Product> products;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Product product;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(String cartId, Customer customer, List<Product> products) {
		super();
		this.cartId = cartId;
		this.customer = customer;
		this.products = products;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public Customer getcustomer() {
		return customer;
	}

	public void setcustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", customer=" + customer + ", products=" + products + "]";
	}

	
}