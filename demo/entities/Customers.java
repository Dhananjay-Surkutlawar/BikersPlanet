package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	int id;
	
	@Column
	String fname;
	
	@Column
	String lname;
	
	@OneToOne
	@JoinColumn(name="city_id")
	City city_id;
	
	@OneToOne
	@JoinColumn(name="logger_id")
	Login logger_id;
	
	
	public Customers() {
		super();
	}

	public Customers(int id, String fname, String lname, City city_id, Login logger_id) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.city_id = city_id;
		this.logger_id = logger_id;
	}

	public Customers(String fname, String lname, City city_id, Login logger_id) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.city_id = city_id;
		this.logger_id = logger_id;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public City getCity_id() {
		return city_id;
	}

	public void setCity_id(City city_id) {
		this.city_id = city_id;
	}

	public Login getLogger_id() {
		return logger_id;
	}

	public void setLogger_id(Login logger_id) {
		this.logger_id = logger_id;
	}
	

}
