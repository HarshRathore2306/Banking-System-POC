package com.deloitte.banking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Login {

	@NotNull(message = "field can't be empty")
	@Email(message = "invalid format")
	private String username;
	
	@NotNull(message = "field can't be empty")
	@Size(max = 8,min = 4,message = "length should btw 4 to 8")
	private String password;

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

	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

}
