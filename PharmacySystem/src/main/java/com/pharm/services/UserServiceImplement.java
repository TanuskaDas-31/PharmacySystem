package com.pharm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharm.dao.UserDao;
import com.pharm.entities.BookMedicine;
import com.pharm.entities.UserRegister;

@Service
public class UserServiceImplement implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	public UserServiceImplement() {
	}
	
	//GET ALL USER
	@Override
	public List<UserRegister> getUsers() {
		return userDao.findAll();
	}
	
	//ADD USER
	@Override
	public UserRegister addUser(UserRegister user) {
		
		for(BookMedicine bookmed :user.getBookmed()) {
			bookmed.setUser(user);
		}
		user.setBookMedicine(user.getBookmed());
	
		userDao.save(user);
		return user;
	}
	
	//GET SINGLE USER
	@Override
	public UserRegister getUsers(int userId) {

		return userDao.findById(userId).get();
	}

}
