package com.ashokIT.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokIT.Entity.PaymentInfo;

public interface PaymentRepo extends JpaRepository<PaymentInfo, Serializable>{

}
