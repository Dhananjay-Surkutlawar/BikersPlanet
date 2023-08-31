package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Bikes;
import com.example.demo.entities.City;
import com.example.demo.entities.Customers;
import com.example.demo.entities.Dealer;
import com.example.demo.entities.Login;
import com.example.demo.entities.TestrideRegister;
import com.example.demo.entities.Testrides;
import com.example.demo.services.BikeService;
import com.example.demo.services.CustomerService;
import com.example.demo.services.DealerService;
import com.example.demo.services.LoginService;
import com.example.demo.services.TestrideServices;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TestrideController {
	
	@Autowired
	TestrideServices testrideservice;
	
	@Autowired
	CustomerService custService;
	
	@Autowired
	DealerService dealservice;
	
	@Autowired
	BikeService bikeservice;
	
	@Autowired
	LoginService loginService;
	

	@GetMapping("/Alltestrides")
	public List<Testrides> getAll()
	{
		return testrideservice.getall();
	}
//	
	@PostMapping("/booktestride")
	public Testrides creaTestrides(@RequestBody TestrideRegister trs)
	{

		Dealer d=dealservice.getById(trs.getDealer_id());
		Bikes b=bikeservice.getById(trs.getBike_id());
		Login l=loginService.getById(trs.getLogger_id());
		Testrides tr=new Testrides(trs.getId(),trs.getDate1(),b,d,l);
		
		return testrideservice.createTestride(tr);
		
		
	}
	
	@GetMapping("/findtestridebydealerid")
	public List<Testrides> findtestridebydealerid(@RequestParam("dealer_id") int dealer_id)
	{
		Dealer d=dealservice.getById(dealer_id);
		return testrideservice.findtestridebydealerid(d);
	}

}
