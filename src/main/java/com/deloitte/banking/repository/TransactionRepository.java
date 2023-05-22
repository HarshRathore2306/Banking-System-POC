package com.deloitte.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.banking.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
