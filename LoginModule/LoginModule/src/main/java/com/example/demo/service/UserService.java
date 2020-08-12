package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Users;
import com.example.demo.exception.UserException;

public interface UserService {

	 public Users saveUser(Users user) throws UserException;

	
	public Users loginUser(Users user) throws UserException;

	public List<Users> showAllUsers();

	
	public void deleteUser(Integer userId);

	public String loginAdmin(Users user) throws UserException;
}
