package com.example.demo.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="testrides")

public class Testrides {
	
	
	@Id
	int id;
	
	@Column
    String date;
	@Column
	int ride_status;
	@OneToOne
    @JoinColumn(name = "bike_id")
    private Bikes bike_id ;
	
//	@OneToOne
//    @JoinColumn(name = "cust_id")
//    private Customers cust_id ;
	
	@OneToOne
    @JoinColumn(name = "dealer_id")
    private Dealer dealer_id ;
	
	@OneToOne
	@JoinColumn(name="logger_id")
	private Login logger_id;

	public Testrides(int id, String date, Bikes bike_id, Dealer dealer_id, Login logger_id) {
		super();
		this.id = id;
		this.date = date;
		this.bike_id = bike_id;
//		this.cust_id = cust_id;
		this.dealer_id = dealer_id;
		this.logger_id = logger_id;
	}

	public Testrides(int id, String date, int ride_status, Bikes bike_id, Dealer dealer_id, Login logger_id) {
		super();
		this.id = id;
		this.date = date;
		this.ride_status = ride_status;
		this.bike_id = bike_id;
		this.dealer_id = dealer_id;
		this.logger_id = logger_id;
	}

	public Login getLogger_id() {
		return logger_id;
	}

	public void setLogger_id(Login logger_id) {
		this.logger_id = logger_id;
	}

	public Testrides() {
		super();
	}

	public Testrides(int id, String date, Bikes bike_id, Customers cust_id, Dealer dealer_id) {
		super();
		this.id = id;
		this.date = date;
		this.bike_id = bike_id;
	//	this.cust_id = cust_id;
		this.dealer_id = dealer_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Bikes getBike_id() {
		return bike_id;
	}

	public void setBike_id(Bikes bike_id) {
		this.bike_id = bike_id;
	}

//	public Customers getCust_id() {
//		return cust_id;
//	}
//
//	public void setCust_id(Customers cust_id) {
//		this.cust_id = cust_id;
//	}

	public Dealer getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(Dealer dealer_id) {
		this.dealer_id = dealer_id;
	}

	public int getRide_status() {
		return ride_status;
	}

	public void setRide_status(int ride_status) {
		this.ride_status = ride_status;
	}
	
	
	
	
	
	
	
	

}
