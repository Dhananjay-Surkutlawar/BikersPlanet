package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Companies;
import com.example.demo.services.CompaniesServices;


@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class CompaniesController {
	
	@Autowired
	CompaniesServices comservice;
	
	@GetMapping("/Allcompanies")
	public List<Companies> getAll()
	{
		return comservice.getAll();
	}

}
