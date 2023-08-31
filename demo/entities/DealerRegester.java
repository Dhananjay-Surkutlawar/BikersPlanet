package com.example.demo.entities;

public class DealerRegester {
	
	private String owner_name,address,mobile_no,email,password,answer;
	private int dealer_id,company,d_city,log_id,role_id,q_id;
	public DealerRegester() {
		super();
	}
//	public DealerRegester(String owner_name, String address, String mobile_no, String email, String password,
//			String answer, int dealer_id, int company, int d_city, int log_id, int role_id, int q_id) {
//		super();
//		this.owner_name = owner_name;
//		this.address = address;
//		this.mobile_no = mobile_no;
//		this.email = email;
//		this.password = password;
//		this.answer = answer;
//		this.dealer_id = dealer_id;
//		this.company = company;
//		this.d_city = d_city;
//		this.log_id = log_id;
//		this.role_id = role_id;
//		this.q_id = q_id;
//	}
	
	
	
	public String getOwner_name() {
		return owner_name;
	}
	public DealerRegester(String owner_name, String address, String mobile_no, int dealer_id, int company, int d_city,
		int log_id) {
	super();
	this.owner_name = owner_name;
	this.address = address;
	this.mobile_no = mobile_no;
	this.dealer_id = dealer_id;
	this.company = company;
	this.d_city = d_city;
	this.log_id = log_id;
}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getAddress() {
		return address;
	}
	public void
	setAddress(String address) {
		this.address = address;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getDealer_id() {
		return dealer_id;
	}
	public void setDealer_id(int dealer_id) {
		this.dealer_id = dealer_id;
	}
	public int getCompany() {
		return company;
	}
	public void setCompany(int company) {
		this.company = company;
	}
	public int getD_city() {
		return d_city;
	}
	public void setD_city(int d_city) {
		this.d_city = d_city;
	}
	public int getLog_id() {
		return log_id;
	}
	public void setLog_id(int log_id) {
		this.log_id = log_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	
	

}
