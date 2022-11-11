package com.shopbag.service;

import java.time.LocalDate;
import java.util.List;

import com.shopbag.exception.OrderException;
import com.shopbag.model.Order;

public interface OrderService {
	public Order addOrder(Order order);
	
	public Order updateOrder(Order order) throws OrderException;
	
	public Order removeOrder(Order order) throws OrderException;
	
	public Order viewOrder(Order order) throws OrderException;
	
	public List<Order> viewAllOrders(LocalDate date) throws OrderException;
	
	public List<Order> viewAllOrdersByLocation(String loc) throws OrderException;
	
	public List<Order> viewAllOrdersByuserId(String userId) throws OrderException;
}
