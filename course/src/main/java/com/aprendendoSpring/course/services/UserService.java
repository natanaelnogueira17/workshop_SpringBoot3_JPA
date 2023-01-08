package com.aprendendoSpring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendoSpring.course.entities.User;
import com.aprendendoSpring.course.repositorys.UserRepository;

@Service
public class UserService {
	@Autowired   // instanciou o Userrepository
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long Id) {
		Optional <User> obj = repository.findById(Id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
