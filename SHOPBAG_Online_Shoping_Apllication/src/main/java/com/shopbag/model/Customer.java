package com.shopbag.model;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Embeddable
public class Customer {

//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String customerId;
	private String firstName;
	private String lastname;
	private String mobileNumber;
	private Address address;
	private String email;
	
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String customerId, String firstName, String lastname, String mobileNumber, Address address,
			String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.email = email;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastname=" + lastname
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + ", email=" + email + "]";
	}
	
	
	
	
}
