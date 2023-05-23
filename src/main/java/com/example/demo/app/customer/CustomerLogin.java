package com.example.demo.app.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CustomerLogin {
	
	private String mailaddress;
	private String password;
	
	
	public String getMailaddress() {
		return mailaddress;
	}
	
	@NotNull
	@Email(message = "Invalid E-mail Format")
	public void setMailaddress(String mailaddress) {
		this.mailaddress = mailaddress;
	}
	
	@Size(min = 6, max = 20, message = "Password must be between 6 and 20 characters")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	

}
