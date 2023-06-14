package com.example.demo.entity;

import java.time.LocalDateTime;

public class CartEntity {
	
	private String comno;
	private String comcategory; 
	private String comname; 
	private String colour;
	private String siz;
	private String price;
	private String photo;
	private String quantity;
    private LocalDateTime created;
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
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

    
    

}
