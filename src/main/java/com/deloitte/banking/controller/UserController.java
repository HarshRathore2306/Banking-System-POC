package com.deloitte.banking.controller;

import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.banking.entity.User;
import com.deloitte.banking.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/view/{username}")
	public User getUser(@PathVariable String username){
		return userService.getUserByUsername(username);	
	}
	
	Map<String,User> user;
	
	@PostMapping("/add")
	public void addNewUser(@RequestBody User user) {
		//generate a random id
		String id= UUID.randomUUID().toString();
	
		userService.addUser(user);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		
		return null;
	}
	
	@DeleteMapping("/delete")
	void deleteUser() {
		
	}

}
