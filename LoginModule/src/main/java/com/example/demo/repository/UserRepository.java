package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Users;





public interface UserRepository extends JpaRepository<Users, Integer>{
	public Users findByEmailId(String emailId);
	public Users findByEmailIdAndUserPassword(String emailId, String userPassword); 

}
