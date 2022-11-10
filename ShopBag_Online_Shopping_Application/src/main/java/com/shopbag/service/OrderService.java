package com.shopbag.service;

import java.time.LocalDate;
import java.util.List;

import com.shopbag.model.Order;

public interface OrderService {
	public Order addOrder(Order order);
	
	public Order updateOrder(Order order);
	
	public Order removeOrder(Order order);
	
	public Order viewOrder(Order order);
	
	public List<Order> viewAllOrders(LocalDate order);
	
	public List<Order> viewAllOrdersByLocation(String loc);
	
	public List<Order> viewAllOrdersByuserId(String userId);
}
