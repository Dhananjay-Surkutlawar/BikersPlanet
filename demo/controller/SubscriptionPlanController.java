package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.City;
import com.example.demo.entities.SubscriptionPlan;
import com.example.demo.services.CityService;
import com.example.demo.services.SubscriptionPlanService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SubscriptionPlanController {
	
	

	@Autowired
	SubscriptionPlanService planservices;
	
	
	@GetMapping("/Allplan")
	public List<SubscriptionPlan> getAll()
	{
		return planservices.getAll();
	}
	
	@PostMapping("/Saveplan")
	public SubscriptionPlan savePlan (@RequestBody SubscriptionPlan sp)
	{
		return planservices.savePlan(sp);
	}

}
