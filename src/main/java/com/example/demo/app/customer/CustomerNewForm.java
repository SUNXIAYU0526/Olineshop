package com.example.demo.app.customer;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public class CustomerNewForm {
	
	@Size(min = 5, max =5,  message = "Please input 5characters or less")
	private String custno;
	
	@Size(min = 1, max = 100, message = "Please input 100characters or less")
	private String custname;
	
	@Size(min = 1, max = 100, message = "Please input 100characters or less")
	private String custfurigana;
	
	@NotNull
	@Email(message = "Invalid E-mail Format")
	private String mailaddress;
	
	@Size(min = 6, max = 20, message = "Password must be between 6 and 20 characters")
	private String password;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String birthday;
	
	@Size(min = 1, max = 100, message = "Please input 1characters")
	private String sex;
	@Size(min =7, max = 7, message = "Please input 7characters ")
	private String postno;
	
	@Size(min = 1, max = 100, message = "Please input 100characters or less")
	private String address;
	
	@Pattern(regexp = "\\d{11}", message = "Invalid phone number")
	private String telno;

	public String getCustno() {
		return custno;
	}

	public void setCustno(String custno) {
		this.custno = custno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustfurigana() {
		return custfurigana;
	}

	public void setCustfurigana(String custfurigana) {
		this.custfurigana = custfurigana;
	}

	public String getMailaddress() {
		return mailaddress;
	}

	public void setMailaddress(String mailaddress) {
		this.mailaddress = mailaddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPostno() {
		return postno;
	}

	public void setPostno(String postno) {
		this.postno = postno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}
	
}

	

	