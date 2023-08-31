package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.BikeRating;
import com.example.demo.entities.BikeratingRegister;
import com.example.demo.entities.Bikes;
import com.example.demo.entities.City;
import com.example.demo.entities.CustomerRegister;
import com.example.demo.entities.Customers;
import com.example.demo.services.BikeService;
import com.example.demo.services.BikeratingService;
import com.example.demo.services.CustomerService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BikeratingController {
	
	@Autowired
	BikeratingService bikeratingservice;
	
	@Autowired
	BikeService bikeservice;
	
	@Autowired
	CustomerService customerservice;
	

				@GetMapping("/Allbikeratings")
					public List<BikeRating> getAll()
					{
						return bikeratingservice.getAll();
					}
				
				@PostMapping("/insertbikerating")
			    public BikeRating bikerating(@RequestBody BikeratingRegister brr ) {
					
					
					Bikes b= bikeservice.getById(brr.getB_id());
					Customers c= customerservice.getById(brr.getCustomer_id());
					
					BikeRating br= new BikeRating(brr.getId(),brr.getRating(),b,c);
					
					return bikeratingservice.creatBikerating(br);
				
				}
				
				

}
