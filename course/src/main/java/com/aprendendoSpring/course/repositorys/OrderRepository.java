package com.aprendendoSpring.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
