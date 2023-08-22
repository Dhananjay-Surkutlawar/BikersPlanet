package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Companies;
import com.example.demo.services.CompanyService;

@RestController
public class CompanyController {
	
	@Autowired
	CompanyService cservice;
	
	@PostMapping("/Allcomapanies")
	public List<Companies> getAll()
	{
		return cservice.getAll();
	}

}
