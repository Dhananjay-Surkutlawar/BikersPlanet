package com.example.demo.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_types")
public class CustomerType {
    @Id
    private int id;
    @Column
    private String name;
    
   

	public CustomerType() {
		super();
	}
	

	public CustomerType(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public CustomerType(String name) {
		super();
		this.name = name;
	}


	public CustomerType(int id) {
		super();
		this.id = id;
	}


	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "CustomerType [id=" + id + ", name=" + name + "]";
	}
    
	
   
    
}
