package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.City;
import com.example.demo.services.CityService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CityController 
{

	
	@Autowired
	CityService cservices;
	
	
	@GetMapping("/Allcity")
	public List<City> getAll()
	{
		return cservices.getAll();
	}
	
	@PostMapping("/Savecity")
	public City saveCity (@RequestBody City c)
	{
		return cservices.saveCity(c);
	}
	
}
