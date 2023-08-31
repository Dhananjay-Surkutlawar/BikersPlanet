package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.City;
import com.example.demo.entities.CustomerType;
import com.example.demo.entities.Customers;
import com.example.demo.entities.Login;

public interface CustomerRepo extends JpaRepository<Customers, Integer> {

	
//	  @Query("Select c from Customers c where logger_id =l: and city_id=ct:")
//	  public Customers getCustomer(Login l,City ct);
	  
	  @Query("SELECT c FROM Customers c WHERE logger_id = :l AND city_id = :ct")
	  public Customers getCustomer(@Param("l") Login l, @Param("ct") City ct);
	  
	  
	  @Query("SELECT l FROM Customers l ORDER BY l.id DESC LIMIT 1")
	    Customers findLastEntry();
	    
	  
//	  @Query("Select c from Customers c where logger_id =l:")
//	  public Customers getCustomer(Login l);
	
}
