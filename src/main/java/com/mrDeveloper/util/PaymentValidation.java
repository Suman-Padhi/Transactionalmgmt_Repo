package com.mrDeveloper.util;

import java.util.HashMap;
import java.util.Map;

import com.mrDeveloper.Entity.PaymentInfo;
import com.mrDeveloper.exception.InsufficientAmountException;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PaymentValidation {

	private static Map<String,Double> products=new HashMap<String,Double>();
	
	static {
		products.put("Mobile", 20000.00);
		products.put("Laptop", 55000.00);
		products.put("Tablet", 25000.00);
		products.put("Jbl Speker", 7000.00);
	}
	
	public static boolean validatePaymentInfo(PaymentInfo paymentnfo) {
		
		if(paymentnfo.getAmount()<products.get(paymentnfo.getProductName())) {
			throw new InsufficientAmountException(" Insufficient Amount ");
		}
		return false;
		
	}
}
