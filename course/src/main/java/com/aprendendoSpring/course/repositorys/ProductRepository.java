package com.aprendendoSpring.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
