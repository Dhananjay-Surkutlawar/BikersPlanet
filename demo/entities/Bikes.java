package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bikes")
public class Bikes {
	
	@Id
	int id;
	
	@Column
	String name;
	
	@Column
	String mileage;
	
	@Column
	String transmission;
	
	@Column
	String kerbweight;
	
	@Column
	String fueltank;
	
	@Column
    String seatheight;
	
	@Column
	String price;
	
	@Column
	byte[] img;
	
	public byte[] getImg() {
		return img;
	}










	public Bikes(String name, String mileage, String transmission, String kerbweight, String fueltank,
			String seatheight, String price, byte[] img, Companies bike_company_id, BikeCategory bike_cat_id) {
		super();
		//this.id = id;
		this.name = name;
		this.mileage = mileage;
		this.transmission = transmission;
		this.kerbweight = kerbweight;
		this.fueltank = fueltank;
		this.seatheight = seatheight;
		this.price = price;
		this.img = img;
		this.bike_company_id = bike_company_id;
		this.bike_cat_id = bike_cat_id;
	}










	public void setImg(byte[] img) {
		this.img = img;
	}





	@ManyToOne
    @JoinColumn(name = "bike_company_id")
    private Companies bike_company_id ;
	
    @ManyToOne
    @JoinColumn(name = "bike_cat_id")
    private BikeCategory bike_cat_id;

	public Bikes() {
		super();
	}

	








	public Companies getBike_company_id() {
		return bike_company_id;
	}










	public void setBike_company_id(Companies bike_company_id) {
		this.bike_company_id = bike_company_id;
	}










	public BikeCategory getBike_cat_id() {
		return bike_cat_id;
	}



	public void setBike_cat_id(BikeCategory bike_cat_id) {
		this.bike_cat_id = bike_cat_id;
	}



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

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getKerbweight() {
		return kerbweight;
	}

	public void setKerbweight(String kerbweight) {
		this.kerbweight = kerbweight;
	}

	

	public String getFueltank() {
		return fueltank;
	}





	public void setFueltank(String fueltank) {
		this.fueltank = fueltank;
	}





	public String getSeatheight() {
		return seatheight;
	}

	public void setSeatheight(String seatheight) {
		this.seatheight = seatheight;
	}





	public String getPrice() {
		return price;
	}





	public void setPrice(String price) {
		this.price = price;
	}

	

	
	
    
	

}
