package com.ashokIT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokIT.Entity.OrderInfo;
import com.ashokIT.Entity.PaymentInfo;
import com.ashokIT.dto.OrderAcknowledgement;
import com.ashokIT.dto.OrderRequest;
import com.ashokIT.repositories.OrderRepo;
import com.ashokIT.repositories.PaymentRepo;
import com.ashokIT.util.PaymentValidation;

import jakarta.transaction.Transactional;
@Service
public class OrderService {
	
	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private PaymentRepo paymentRepo; 
	
	@Transactional
	public OrderAcknowledgement saveOrder(OrderRequest orderequest) {
		
		OrderInfo orderInfo=orderequest.getOrderInfo();
		if (orderInfo == null) {
		    throw new IllegalArgumentException("OrderInfo cannot be null");
		}
		orderInfo=orderRepo.save(orderInfo);
		
		PaymentInfo paymentInfo=orderequest.getPaymentInfo();
		orderInfo.setProdutName(paymentInfo.getProductName());
		PaymentValidation.validatePaymentInfo(paymentInfo);
		orderRepo.save(orderInfo);
		paymentInfo=paymentRepo.save(paymentInfo);
		return new OrderAcknowledgement("Success",paymentInfo,paymentInfo.getAmount());
	}



}
