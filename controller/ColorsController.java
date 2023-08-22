package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Colors;
import com.example.demo.services.ColorsService;

@RestController
public class ColorsController {
	
	@Autowired
	ColorsService cservice;
	
	@PostMapping("/Allcolors")
	public List<Colors> getAll()
	{
		return cservice.getAll();
	}

}
