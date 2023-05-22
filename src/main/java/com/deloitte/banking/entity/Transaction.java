package com.deloitte.banking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
	@Id
	private String id;	
	private String discription;
	private String type;
	private double amount;
	private double balance;
		
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(String id, String discription, String type, double amount, double balance) {
		super();
		this.id = id;
		this.discription = discription;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	


}
