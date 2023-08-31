package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.BikeCategory;
import com.example.demo.entities.Bikes;
import com.example.demo.entities.City;
import com.example.demo.entities.Companies;
import com.example.demo.entities.Customers;
import com.example.demo.repositories.BikeRepo;

@Service
public class BikeService {

	@Autowired
	BikeRepo bikerepo;
	
	
	
	public List<Bikes> getAll()
	{
		return (List<Bikes>) bikerepo.findAll();
	}
//	
//	public List<Bikes> getAllbycompany(int company_id)
//	{
//		return (List<Bikes>) bikerepo.findByBikeCatId(company_id);
//	}
	
	
	public List<Bikes> getBikesByCompanyId(Companies c) {
        return bikerepo.findByBikeCompanyId(c);
    }

    public List<Bikes> getBikesByCategoryId(BikeCategory b) {
        return bikerepo.findByBikeCatId(b);
    }
        
        public Bikes getById(int bikes)
	    {
	    	return bikerepo.findById(bikes).get();
	    }
	
}
