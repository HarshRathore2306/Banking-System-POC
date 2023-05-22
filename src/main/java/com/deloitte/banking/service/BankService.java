package com.deloitte.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.logging.log4j.spi.LoggerContextShutdownAware;
import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.deloitte.banking.entity.Login;
import com.deloitte.banking.entity.User;
import com.deloitte.banking.exception.DetailNotFoundException;
import com.deloitte.banking.exception.InvalidloginException;
import com.deloitte.banking.repository.BankRepository;
import com.deloitte.banking.repository.UserRepository;

import ch.qos.logback.classic.Logger;

@Service
public class BankService {

	@Autowired
	private UserRepository userRepo;

	private final org.slf4j.Logger Logger = LoggerFactory.getLogger(this.getClass());

	// login service

	// login authentication through jdbc database

	public boolean checkAuth(Login login){
		User user = userRepo.findbyusername(login.getUsername());
		if (login.getPassword().equals(user.getPassword()) ) {
		
			Logger.info("login successfully");	
			return true;
		}

		Logger.error("login details are incorrect");
		throw new InvalidloginException("Invalid login");
//		return false;
	}

}
