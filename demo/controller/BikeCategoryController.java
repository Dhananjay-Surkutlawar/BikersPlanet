package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.BikeCategory;
import com.example.demo.entities.City;
import com.example.demo.services.BikeCategoryService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class BikeCategoryController {
	
	@Autowired
	BikeCategoryService bcservice;
	
	@GetMapping("/Allbikecat")
	public List<BikeCategory> getAll()
	{
		return bcservice.getAll();
	}

}
