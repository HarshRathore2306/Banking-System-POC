package com.deloitte.banking.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
//@Table(name="User")
public class User {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	private String name;
	private String address;
	private int account_no;
	private double balance;
	private String username;
	private String password;
	public User(int uid, String name, String address, int account_no, double balance, String username,
			String password) {
		super();
		this.uid = uid;
		this.name = name;
		this.address = address;
		this.account_no = account_no;
		this.balance = balance;
		this.username = username;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
