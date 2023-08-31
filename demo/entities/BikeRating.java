package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="rating_bikes")
public class BikeRating {

	@Id
	int id;
	
	@Column
	double rating;
	
	@ManyToOne
	@JoinColumn(name="b_id")
	Bikes b_id;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	Customers customer_id;

	public BikeRating() {
		super();
	}

	public BikeRating(int id, double d, Bikes b_id, Customers customer_id) {
		super();
		this.id = id;
		this.rating = d;
		this.b_id = b_id;
		this.customer_id = customer_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Bikes getB_id() {
		return b_id;
	}

	public void setB_id(Bikes b_id) {
		this.b_id = b_id;
	}

	public Customers getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Customers customer_id) {
		this.customer_id = customer_id;
	}
	
	
	
	
	
	
}
