package com.deloitte.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.banking.entity.Benificary;

public interface BenificaryRepository extends JpaRepository<Benificary, Integer> {

}
