package com.example.demo.entities;

import java.sql.Date;

public class TestrideRegister {
	
	
	int id,dealer_id,bike_id,logger_id;
	String date1;
	
	public TestrideRegister(int id, int dealer_id, int bike_id, int logger_id, String date1) {
		super();
		this.id = id;
		//this.cust_id = cust_id;
		this.dealer_id = dealer_id;
		this.bike_id = bike_id;
		this.logger_id = logger_id;
		this.date1 = date1;
	}

	

	

	public int getLogger_id() {
		return logger_id;
	}

	public void setLogger_id(int logger_id) {
		this.logger_id = logger_id;
	}



	public String getDate1() {
		return date1;
	}





	public void setDate1(String date1) {
		this.date1 = date1;
	}





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public int getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(int dealer_id) {
		this.dealer_id = dealer_id;
	}

	public int getBike_id() {
		return bike_id;
	}

	public void setBike_id(int bike_id) {
		this.bike_id = bike_id;
	}

	
	
	

}
