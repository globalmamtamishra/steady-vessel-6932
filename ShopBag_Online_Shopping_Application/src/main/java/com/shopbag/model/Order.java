package com.shopbag.model;

import java.time.LocalDate;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String orderId;
	private LocalDate orderDate;
	private String orderStatus;
	private Customer cutomer;
	private Map<Integer, Product> productList;
	private Address address;
	
	public Order() {}

	public Order(String orderId, LocalDate orderDate, String orderStatus, Customer cutomer,
			Map<Integer, Product> productList, Address address) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.cutomer = cutomer;
		this.productList = productList;
		this.address = address;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
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

	public Customer getCutomer() {
		return cutomer;
	}

	public void setCutomer(Customer cutomer) {
		this.cutomer = cutomer;
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
				+ cutomer + ", productList=" + productList + ", address=" + address + "]";
	}
}
