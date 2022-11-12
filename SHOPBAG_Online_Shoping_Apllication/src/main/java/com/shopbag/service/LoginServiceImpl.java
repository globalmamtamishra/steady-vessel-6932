package com.shopbag.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.shopbag.exception.LoginException;
import com.shopbag.model.LoginDTO;
import com.shopbag.repository.CurrentUserSessionRepo;
import com.shopbag.repository.CustomerRepo;

public class LoginServiceImpl implements LoginService {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private CurrentUserSessionRepo sessionRepo;
	
	@Override
	public String loginIntoAccount(LoginDTO dto) throws LoginException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logoutFromAccount(String key) throws LoginException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
