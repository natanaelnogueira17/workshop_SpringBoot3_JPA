package com.aprendendoSpring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendoSpring.course.entities.Order;
import com.aprendendoSpring.course.repositorys.Orderrepository;


@Service
public class OrderService {
	@Autowired
	private Orderrepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long Id) {
		Optional <Order> obj = orderRepository.findById(Id);
		return obj.get();
	}
	
}
