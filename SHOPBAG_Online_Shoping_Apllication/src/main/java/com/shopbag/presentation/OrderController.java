package com.shopbag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.shopbag.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	public OrderService os;
	
	
}
