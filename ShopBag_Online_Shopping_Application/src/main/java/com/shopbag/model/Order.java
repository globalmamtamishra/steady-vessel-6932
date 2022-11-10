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
	private Map productList;
	private Address address;
}
