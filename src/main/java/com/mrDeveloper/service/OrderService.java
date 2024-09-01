package com.mrDeveloper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrDeveloper.Entity.OrderInfo;
import com.mrDeveloper.Entity.PaymentInfo;
import com.mrDeveloper.dto.OrderAcknowledgement;
import com.mrDeveloper.dto.OrderRequest;
import com.mrDeveloper.repositories.OrderRepo;
import com.mrDeveloper.repositories.PaymentRepo;
import com.mrDeveloper.util.PaymentValidation;

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
