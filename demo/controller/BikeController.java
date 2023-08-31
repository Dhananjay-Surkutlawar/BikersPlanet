package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.BikeCategory;
import com.example.demo.entities.Bikes;
import com.example.demo.entities.Companies;
import com.example.demo.services.BikeCategoryService;
import com.example.demo.services.BikeService;
import com.example.demo.services.CompaniesServices;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BikeController {
	
	@Autowired
	BikeService bikeservice;
	
	@Autowired
	CompaniesServices cservice;
	
	@Autowired
	BikeCategoryService bcservices;
	
	@GetMapping("/Allbikes")
	public List<Bikes> getAll()
	{
		return bikeservice.getAll();
	}
	
//	 @GetMapping("/bikebyCompany")
//	 public List<Bikes> getAllbycompany(@RequestParam	 int bike_company_id)
//	{
//		return bikeservice.getAllbycompany( bike_company_id);
//	}
	
	
//
//	 @PostMapping("/bikebyCompany")
//	    public List<Bikes> getBikesByCompanyId(@RequestBody int bike_company_id) {
//	        return bikeservice.getBikesByCompanyId(bike_company_id);
//	    }

	    

	    
	    @GetMapping("/bikebyCompany")
	    public List<Bikes> getBikesByCompanyId(@RequestParam("bike_company_id")	 int bike_company_id) {
	    	
	    	Companies c = cservice.getById(bike_company_id);
	    	
	        return bikeservice.getBikesByCompanyId( c );
	    }
	    
	    
	    @GetMapping("/bikebyCategory")
	    public List<Bikes> getBikesByCategoryId(@RequestParam("bike_cat_id") int bike_cat_id) {
	    	
	    	BikeCategory bc = bcservices.getById(bike_cat_id);
	    	
	        return bikeservice.getBikesByCategoryId(bc);
	    }
	    
	    
	    @GetMapping("/bikebyid")
	    public Bikes getbyId(@RequestParam("bikeid") int bikeid)
	    {
	    	return bikeservice.getById(bikeid);
	    }
	
	 
}
