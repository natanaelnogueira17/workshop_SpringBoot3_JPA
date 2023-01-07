package com.aprendendoSpring.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.course.entities.Order;

public interface Orderrepository extends JpaRepository<Order, Long>{
	
}
