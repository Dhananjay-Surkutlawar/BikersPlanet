package com.example.demo.entities;

public class CustomerRegister {
	
	private int customerid;
	private String fname;
	private String lname;
	private int city_id;
	private int logger_id;
	private String email;
	private String password;
	private int questionid;
	private String answer;
	private int roleid;
   	
	
	
	
	
	public CustomerRegister(int id, String fname, String lname, int city_id, int logger_id, String email,
			String password, int questionid, String answer,int roleid) {
		super();
		this.customerid = id;
		this.fname = fname;
		this.lname = lname;
		this.city_id = city_id;
		this.logger_id = logger_id;
		this.email = email;
		this.password = password;
		this.questionid = questionid;
		this.answer = answer;
		this.roleid =roleid;
	}
	
	
	
	public CustomerRegister(int id,String fname, String lname, int city_id, int logger_id) {
		super();
		this.customerid = id;
		this.fname = fname;
		this.lname = lname;
		this.city_id = city_id;
		this.logger_id = logger_id;
	}



	public CustomerRegister() {
		super();
	}
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
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
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
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
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public int getLogger_id() {
		return logger_id;
	}
	public void setLogger_id(int logger_id) {
		this.logger_id = logger_id;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	
	
}
