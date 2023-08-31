package com.example.demo.entities;

public class BikeratingRegister {
	
	int id,customer_id,b_id;
	double rating;
	public BikeratingRegister(int id, int customer_id, int b_id, double rating) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.b_id = b_id;
		this.rating = rating;
	}
	public BikeratingRegister() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	

}
