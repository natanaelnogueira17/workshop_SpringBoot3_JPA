package com.aprendendoSpring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendoSpring.course.entities.Product;
import com.aprendendoSpring.course.repositorys.ProductRepository;

@Service
public class ProductService {
	@Autowired   // instanciou o Productrepository
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long Id) {
		Optional <Product> obj = repository.findById(Id);
		return obj.get();
	}
	
}
