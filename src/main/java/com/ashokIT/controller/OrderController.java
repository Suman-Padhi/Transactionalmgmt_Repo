package com.ashokIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokIT.dto.OrderAcknowledgement;
import com.ashokIT.dto.OrderRequest;
import com.ashokIT.service.OrderService;

@RestController
//@RequestMapping("/api")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping(value="/placeorder",produces="application/json",consumes="application/json")
	public OrderAcknowledgement saveOrderDetails(@RequestBody OrderRequest orderRequest) {
		
		return orderService.saveOrder(orderRequest);
		
	}
}
