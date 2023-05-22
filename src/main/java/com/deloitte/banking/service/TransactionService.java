package com.deloitte.banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.banking.entity.Transaction;
import com.deloitte.banking.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepo;
	
	public List<Transaction> view(){
		return transactionRepo.findAll();
	}

}
