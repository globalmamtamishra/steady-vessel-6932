package com.shopbag.model;

import javax.persistence.Embeddable;

@Embeddable
public class Customer {
	private Integer customerId;
	private String firstName;
	private String lastName;
	private String mobile_number;
	
	public Customer() {}

	public Customer(Integer customerId, String firstName, String lastName, String mobile_number) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile_number = mobile_number;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobile_number=" + mobile_number + "]";
	}
}
