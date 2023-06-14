package com.example.demo.app.cart;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CartForm {
	@Size(min = 5, max =5,  message = "Please input 5characters or less")
	private String comno;
	@Size(min = 1, max = 100, message = "Please input 100characters or less")
	private String comcategory; 
	@Size(min = 1, max = 100, message = "Please input 100characters or less")
	private String comname; 
	@Size(min = 1, max = 100, message = "Please input 100characters or less")
	private String colour;
	@Size(min = 1, max = 100, message = "Please input 100characters or less")
	private String siz;
	@NotNull
	private String price;
	@NotNull
	private String photo;
	@NotNull
	private String quantity;
	public String getComno() {
		return comno;
	}
	public void setComno(String comno) {
		this.comno = comno;
	}
	public String getComcategory() {
		return comcategory;
	}
	public void setComcategory(String comcategory) {
		this.comcategory = comcategory;
	}
	public String getComname() {
		return comname;
	}
	public void setComname(String comname) {
		this.comname = comname;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getSiz() {
		return siz;
	}
	public void setSiz(String siz) {
		this.siz = siz;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}





}
