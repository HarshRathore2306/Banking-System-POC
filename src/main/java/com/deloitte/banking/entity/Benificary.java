package com.deloitte.banking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class Benificary {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bfid;
	
	private String name;
	private int account_no;
	private int ifsc_code;
	
	public Benificary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Benificary(int bfid, String name, int account_no, int ifsc_code) {
		super();
		this.bfid = bfid;
		this.name = name;
		this.account_no = account_no;
		this.ifsc_code = ifsc_code;
	}


	public int getBfid() {
		return bfid;
	}


	public void setBfid(int bfid) {
		this.bfid = bfid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAccount_no() {
		return account_no;
	}


	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}


	public int getIfsc_code() {
		return ifsc_code;
	}


	public void setIfsc_code(int ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	
}
