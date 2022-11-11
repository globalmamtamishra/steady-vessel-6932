package com.shopbag.model;

import java.time.LocalDate;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	
	@NotNull(message = "{date.invalid}")
	private LocalDate orderDate;
	
	@NotNull(message = "{status.invalid}")
	private String orderStatus;
	
	@NotNull(message = "{customer.invalid}")
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;
	
	@NotNull(message = "{product.invalid}")
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Product")
	private Map<Integer, Product> productList;
	
	@NotNull(message = "{address.invalid}")
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	public Order() {}

	public Order(Integer orderId, LocalDate orderDate, String orderStatus, Customer cutomer,
			Map<Integer, Product> productList, Address address) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.customer = cutomer;
		this.productList = productList;
		this.address = address;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Map<Integer, Product> getProductList() {
		return productList;
	}

	public void setProductList(Map<Integer, Product> productList) {
		this.productList = productList;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", cutomer="
				+ customer + ", productList=" + productList + ", address=" + address + "]";
	}
}