package com.shopbag.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int productId;
	
	private String productName;
	private double price;
	private String color;
	private String dimension;
	private String specification;
	private String manufacturer;
	private int quantity;
	
	@Embedded
	private Category category;
}
