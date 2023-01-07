package com.aprendendoSpring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendoSpring.course.entities.Order;
import com.aprendendoSpring.course.repositorys.OrderRepository;


@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long Id) {
		Optional <Order> obj = repository.findById(Id);
		return obj.get();
	}
	
}
