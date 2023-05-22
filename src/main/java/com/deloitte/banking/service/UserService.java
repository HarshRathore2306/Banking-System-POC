package com.deloitte.banking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.banking.entity.User;
import com.deloitte.banking.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	//get user by username
	public User getUserByUsername(String name) {
		return userRepository.findbyusername(name);
	}
	
	//adding new user
	public void addUser(User user) {
		userRepository.save(user);
	}

}
