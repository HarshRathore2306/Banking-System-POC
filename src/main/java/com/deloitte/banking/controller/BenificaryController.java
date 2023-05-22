package com.deloitte.banking.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.banking.entity.Bank;
import com.deloitte.banking.entity.Benificary;
import com.deloitte.banking.repository.BenificaryRepository;
import com.deloitte.banking.service.BenificaryService;

import io.swagger.v3.oas.models.media.MediaType;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/benificary")
public class BenificaryController {
	
	@Autowired
	private BenificaryService benificaryService;
	

	@GetMapping("/view")
	public ResponseEntity<List<Benificary>> getDetails(){
		List<Benificary> list=benificaryService.getall();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();	
		}
		return ResponseEntity.of(Optional.of(list));	
		}
	
	@PostMapping("/add")
	public ResponseEntity<Benificary> addDetails(@RequestBody Benificary benificary) {
		if (benificaryService.add(benificary)) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteDetails(@PathVariable int id){
		benificaryService.delete(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PutMapping(path="/update/{id}")
	public ResponseEntity<Benificary> updateDetails(@PathVariable int id,@RequestBody Benificary benificary){
		
		benificaryService.update(id,benificary);
		return ResponseEntity.status(HttpStatus.OK).build();
			
	}
	

}
