package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.BikeCategory;
import com.example.demo.entities.Bikes;
import com.example.demo.entities.City;
import com.example.demo.entities.Companies;
import com.example.demo.entities.Dealer;
import com.example.demo.entities.Login;

public interface DealerRepo extends JpaRepository<Dealer, Integer> {

	@Query("SELECT d FROM Dealer d WHERE d_city= :dct AND company= :com")
	 List<Dealer> findBycomandcity(City dct,Companies com);
	
	
	@Query("SELECT d FROM Dealer d WHERE  d_city= :l ") 
    List<Dealer> findByCityId(City l);
	
	@Query("SELECT d.id FROM Dealer d WHERE  d.log_id= :l ")
	List<Dealer> finddealerid(Login l);
	
	
	@Query("SELECT d FROM Dealer d WHERE d.log_id= :l")
	List<Dealer> allinfobylogid(Login l);
}

