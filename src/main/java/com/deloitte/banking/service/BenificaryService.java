package com.deloitte.banking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.deloitte.banking.entity.Benificary;
import com.deloitte.banking.repository.BenificaryRepository;

@Service
public class BenificaryService {
	
	@Autowired
	private BenificaryRepository benificaryRepo;
	
	
	public List<Benificary> getall(){
		return benificaryRepo.findAll();
	}
	
	//my method
	public boolean add(Benificary benificary) {
		benificaryRepo.save(benificary);
		return true;
	}
	
	public void delete(int id) {
	benificaryRepo.deleteById(id);
	}

	public void update(int id,Benificary benificary) {

//		Optional<Benificary> ben = benificaryRepo.findById(id);
//		
//		ben.setName(benificary.getName());
//		ben.setIfsc_code(benificary.getIfsc_code());
//		benificaryRepo.save(ben);
		
	}
	
//	
//	@Transactional
//	public boolean addBenificary(Benificary ben)/* throws InvalidFieldException */{
////		if (ben.getIfsc_code() !=null && ben.getName() != null) {
//			boolean result = false;
//			String name = ben.getName();
//			String regex = "^[A-Za-z ]+";
//			if (name.matches(regex)) {
//				admin = adminRepository.save(admin);
//				result = true;
//			}
}
