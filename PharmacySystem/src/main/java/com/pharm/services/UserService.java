package com.pharm.services;

import java.util.List;

import com.pharm.entities.UserRegister;

public interface UserService {
	
	public List<UserRegister> getUsers();
	
	public UserRegister getUsers (int userId);
	
	public UserRegister addUser(UserRegister user);

}
