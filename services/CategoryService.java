package com.aprendendoSpring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendoSpring.course.entities.Category;
import com.aprendendoSpring.course.repositorys.CategoryRepository;

@Service
public class CategoryService {
	@Autowired   // instanciou o Categoryrepository
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long Id) {
		Optional <Category> obj = repository.findById(Id);
		return obj.get();
	}
	
}
