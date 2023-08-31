package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.BikeCategory;
import com.example.demo.entities.CustomerType;
import com.example.demo.services.CustomerTypeService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CustomerTypeController 
{
        @Autowired
        CustomerTypeService ctservice;
        
        
        @GetMapping("/Allcustcat")
    	public List<CustomerType> getAll()
    	{
    		return ctservice.getAll();
    	}
}
