package com.shopbag.model;

import lombok.Data;

@Data
public class LoginDTO {

	private String userId;
	private String password;
	private String role;
	
}
