package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Colors;
import com.example.demo.services.ColorsService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ColorsController {
	
	@Autowired
	ColorsService cservice;
	
	@GetMapping("/Allcolors")
	public List<Colors> getAll()
	{
		return cservice.getAll();
	}

}
