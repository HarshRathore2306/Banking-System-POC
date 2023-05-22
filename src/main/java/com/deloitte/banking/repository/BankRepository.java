package com.deloitte.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.banking.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

}
