package com.mrDeveloper.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrDeveloper.Entity.OrderInfo;

public interface OrderRepo extends JpaRepository<OrderInfo, Serializable> {

}
