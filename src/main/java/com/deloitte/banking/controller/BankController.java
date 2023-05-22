package com.deloitte.banking.controller;

import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.banking.entity.Login;
import com.deloitte.banking.exception.DetailNotFoundException;
import com.deloitte.banking.service.BankService;

@RestController
@CrossOrigin
@RequestMapping("/bank")
public class BankController {

	@Autowired
	private BankService bankService;

	// login logic
	
	
	@PostMapping(path="/login/auth")
	public ResponseEntity<Login> logint(@Valid @RequestBody Login login) throws DetailNotFoundException {
		boolean check = bankService.checkAuth(login);
		if (check == true) {
			return ResponseEntity.status(HttpStatus.FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

}
