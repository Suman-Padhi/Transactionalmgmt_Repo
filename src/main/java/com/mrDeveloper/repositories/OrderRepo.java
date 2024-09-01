package com.ashokIT.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokIT.Entity.OrderInfo;

public interface OrderRepo extends JpaRepository<OrderInfo, Serializable> {

}
