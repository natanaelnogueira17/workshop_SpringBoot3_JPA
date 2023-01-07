package com.aprendendoSpring.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
