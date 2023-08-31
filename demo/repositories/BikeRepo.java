package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.BikeCategory;
import com.example.demo.entities.Bikes;
import com.example.demo.entities.Companies;

@Repository
public interface BikeRepo extends CrudRepository<Bikes, Integer>{
	
	
	@Query("SELECT b FROM Bikes b WHERE bike_company_id = :l ")
	List<Bikes> findByBikeCompanyId(Companies l);
	 
	 
	@Query("SELECT b FROM Bikes b WHERE bike_cat_id = :l ") 
    List<Bikes> findByBikeCatId(BikeCategory l);
	
	@Query("SELECT b FROM Bikes b WHERE id = :l ") 
    Bikes findByBikeId(BikeCategory l);

}
