package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.BikeRating;
import com.example.demo.entities.City;
import com.example.demo.entities.Customers;
import com.example.demo.repositories.BikeratingRepo;

@Service
public class BikeratingService {
	
        @Autowired
        BikeratingRepo bikeratingrepo;
        
        
        public List<BikeRating> getAll()
    	{
    		return (List<BikeRating>) bikeratingrepo.findAll();
    	}
       
        
        public BikeRating creatBikerating(BikeRating bikerating) {
	        return bikeratingrepo.save(bikerating);
	    }
}
