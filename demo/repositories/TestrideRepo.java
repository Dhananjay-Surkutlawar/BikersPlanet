package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Dealer;
import com.example.demo.entities.Testrides;


@Repository
public interface TestrideRepo extends CrudRepository<Testrides, Integer> {

	@Query("Select tr FROM Testrides tr WHERE tr.dealer_id= :d")
	public List<Testrides> findtestridebydealerid(Dealer d);
	
}
