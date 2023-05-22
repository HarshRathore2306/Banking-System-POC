package com.deloitte.banking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.banking.entity.Benificary;
import com.deloitte.banking.entity.Transaction;
import com.deloitte.banking.service.TransactionService;

@RestController
@CrossOrigin
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/view")
	public ResponseEntity<List<Transaction>> getDetails(){
		List<Transaction> list= transactionService.view();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();	
		}
		return ResponseEntity.of(Optional.of(list));	
		}
}
