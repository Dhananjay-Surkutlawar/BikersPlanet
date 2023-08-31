package com.example.demo.entities;

public class RatingDealerRegister {
	
  private double rating;
  int d_id,c_id;
public RatingDealerRegister(double rating, int d_id, int c_id) {
	super();
	this.rating = rating;
	this.d_id = d_id;
	this.c_id = c_id;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public int getD_id() {
	return d_id;
}
public void setD_id(int d_id) {
	this.d_id = d_id;
}
public int getC_id() {
	return c_id;
}
public void setC_id(int c_id) {
	this.c_id = c_id;
}

  
}
