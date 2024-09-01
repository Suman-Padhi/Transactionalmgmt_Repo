package com.ashokIT.dto;



import com.ashokIT.Entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderAcknowledgement {

	private String status;
	
	private double paybleAmount;
	
	private PaymentInfo paymentInfo;



	public OrderAcknowledgement(String status, PaymentInfo paymentInfo, double paybleAmount) {
		this.status=status;
		this.paymentInfo=paymentInfo;
		this.paybleAmount=paybleAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPaybleAmount() {
		return paybleAmount;
	}

	public void setPaybleAmount(double paybleAmount) {
		this.paybleAmount = paybleAmount;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

}
