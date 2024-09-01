package com.mrDeveloper.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrDeveloper.Entity.PaymentInfo;

public interface PaymentRepo extends JpaRepository<PaymentInfo, Serializable>{

}
