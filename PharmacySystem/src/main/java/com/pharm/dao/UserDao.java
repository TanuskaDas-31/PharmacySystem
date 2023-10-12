package com.pharm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharm.entities.UserRegister;

public interface UserDao extends JpaRepository<UserRegister,Integer>{
	
	
	

}
