package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="companies")
public class Companies {
	@Id
	int id;
	
	@Column
	String company_name;

	public Companies() {
		super();
	}

	public Companies(int id, String company_name) {
		super();
		this.id = id;
		this.company_name = company_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	
}
