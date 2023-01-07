package com.aprendendoSpring.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
