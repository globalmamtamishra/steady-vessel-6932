package com.shopbag.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {

	@Id
	private int categoryId;
	private String categoryName;
}
