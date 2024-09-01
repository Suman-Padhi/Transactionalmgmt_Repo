package com.mrDeveloper.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mrDeveloper.dto.OrderAcknowledgement;
import com.mrDeveloper.dto.OrderRequest;
import com.mrDeveloper.service.OrderService;

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
