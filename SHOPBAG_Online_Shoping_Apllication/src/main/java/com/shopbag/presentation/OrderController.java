package com.shopbag.presentation;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopbag.exception.OrderException;
import com.shopbag.model.Order;
import com.shopbag.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	public OrderService os;

	@PostMapping("/addOrder")
	public ResponseEntity<Order> addOrderHandler(@Valid @RequestBody Order order) {
		Order addedOrder = os.addOrder(order);

		return new ResponseEntity<Order>(addedOrder, HttpStatus.OK);
	}

	@PutMapping("/updateOrder")
	public ResponseEntity<Order> updateOrderHandler(@Valid @RequestBody Order order) throws OrderException {
		Order updatedOrder = os.updateOrder(order);

		return new ResponseEntity<Order>(updatedOrder, HttpStatus.OK);
	}

	@DeleteMapping("/deleteOrder")
	public ResponseEntity<Order> removeOrderHandler(@Valid @RequestBody Order order) throws OrderException {
		Order deletedOrder = os.removeOrder(order);

		return new ResponseEntity<Order>(deletedOrder, HttpStatus.OK);
	}

	@GetMapping("/viewOrder")
	public ResponseEntity<Order> viewOrderHandler(@Valid @RequestBody Order order) throws OrderException {
		Order ord = os.viewOrder(order);

		return new ResponseEntity<Order>(ord, HttpStatus.OK);
	}

	@GetMapping("/viewOrders/{date}")
	public ResponseEntity<List<Order>> viewAllOrdersHandler(@Valid @PathVariable("date") LocalDate date) throws OrderException {
		List<Order> listOfOrders = os.viewAllOrders(date);

		return new ResponseEntity<List<Order>>(listOfOrders, HttpStatus.OK);
	}

	@GetMapping("/viewOrdersByLocation/{loc}")
	public ResponseEntity<List<Order>> viewAllOrdersByLocationHandler(@Valid @PathVariable("loc") String loc) throws OrderException {
		List<Order> ordersListByLocation = os.viewAllOrdersByLocation(loc);

		return new ResponseEntity<List<Order>>(ordersListByLocation, HttpStatus.OK);
	}

	@GetMapping("/viewOrdersByUserId")
	public ResponseEntity<List<Order>> viewAllOrdersByuserIdHandler(@Valid @RequestBody String userId) throws OrderException {
		List<Order> ordersListByUserId = os.viewAllOrdersByuserId(userId);

		return new ResponseEntity<List<Order>>(ordersListByUserId, HttpStatus.OK);
	}
}
