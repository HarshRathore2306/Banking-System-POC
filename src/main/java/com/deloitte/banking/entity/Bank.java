package com.deloitte.banking.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	private int account_no;
	private int ifsc_code;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
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
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int bid, int account_no, int ifsc_code) {
		super();
		this.bid = bid;
		this.account_no = account_no;
		this.ifsc_code = ifsc_code;
	}
	


}
