package com.example.demo.app.cartlist;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class CartlistForm {
	@Size(min = 1, max = 100, message = "Please input 100characters or less")
	private String comname;
	
	@Size(min = 5, max =5,  message = "Please input 5characters or less")
	private String comcategory;
	
	@Size(min = 1, max = 100, message = "Please input 100characters or less")
	private String comno;
	
	@Size(min = 1, max = 100, message = "Please input 100characters or less")
	private String siz;
	
	@Size(min = 1, max = 100, message = "Please input 100characters or less")
	private String colour;
	
    private String photo;
    
	@Min(1)
	@Max(99)
	private String quantity;	
	
	@Size(min = 1, max = 100, message = "Please input 100characters or less")
	private String price;
	
	private String total;

	public String getComname() {
		return comname;
	}

	public void setComname(String comname) {
		this.comname = comname;
	}

	public String getComcategory() {
		return comcategory;
	}

	public void setComcategory(String comcategory) {
		this.comcategory = comcategory;
	}

	public String getComno() {
		return comno;
	}

	public void setComno(String comno) {
		this.comno = comno;
	}

	public String getSiz() {
		return siz;
	}

	public void setSiz(String siz) {
		this.siz = siz;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

}
	


		