package com.example.demo.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="dealers")
public class Dealer {
	
	@Id
	int id;
	
	public Dealer(int id, String owner_name, String address_dealer, String mobile_no, City d_city, Login log_id,
			Companies company) {
		super();
		this.id = id;
		this.owner_name = owner_name;
		this.address_dealer = address_dealer;
		this.mobile_no = mobile_no;
		this.d_city = d_city;
		this.log_id = log_id;
		this.company = company;
	}


	public Dealer() {
		super();
	}


	@Column
	String owner_name;
	
	@Column
	String address_dealer;
	
	@Column
	String mobile_no;
	
	@ManyToOne
	@JoinColumn(name="d_city")
	City d_city;
	
	
	@OneToOne
	@JoinColumn(name="log_id")
	Login log_id;
	
	@ManyToOne
	@JoinColumn(name="company")
	Companies company;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getOwner_name() {
		return owner_name;
	}


	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}


	public String getAddress_dealer() {
		return address_dealer;
	}


	public void setAddress_dealer(String address_dealer) {
		this.address_dealer = address_dealer;
	}


	public String getMobile_no() {
		return mobile_no;
	}


	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}


	public City getD_city() {
		return d_city;
	}


	public void setD_city(City d_city) {
		this.d_city = d_city;
	}


	public Login getLog_id() {
		return log_id;
	}


	public void setLog_id(Login log_id) {
		this.log_id = log_id;
	}


	public Companies getCompany() {
		return company;
	}


	public void setCompany(Companies company) {
		this.company = company;
	}

}
