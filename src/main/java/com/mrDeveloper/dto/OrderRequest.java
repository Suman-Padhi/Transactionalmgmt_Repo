package com.mrDeveloper.dto;

import com.mrDeveloper.Entity.OrderInfo;
import com.mrDeveloper.Entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderRequest {

	private OrderInfo orderInfo;
	
	private PaymentInfo paymentInfo;

	public OrderInfo getOrderInfo() {
		System.out.println(orderInfo);
		return orderInfo;
	}

	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
}
