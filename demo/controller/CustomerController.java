package com.example.demo.controller;
import java.util.*;
import com.example.demo.entities.City;
import com.example.demo.entities.CustomerRegister;
import com.example.demo.entities.CustomerType;
import com.example.demo.entities.Login;
import com.example.demo.entities.Question;
import com.example.demo.entities.Customers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.City;
import com.example.demo.entities.Customers;
import com.example.demo.entities.Login;
import com.example.demo.services.CityService;
import com.example.demo.services.CustomerService;
import com.example.demo.services.CustomerTypeService;
import com.example.demo.services.LoginService;
import com.example.demo.services.QuestionsService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class CustomerController {
	
	@Autowired
	CustomerService custserviService;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	CityService cityservice;
	
	@Autowired
	QuestionsService qservice;
	
	@Autowired
	CustomerTypeService customerTypeService;
	
	@GetMapping("/Getcustomers")
	public Customers getCustomers(@RequestParam("logger_id") int logger_id,@RequestParam("city_id") int city_id)
	{
		Login l= loginService.getById(logger_id);
		City c= cityservice.getById(city_id);
		return custserviService.getCustomers(l, c);
	}
	
	@PostMapping("/insertcustomer")
    public Customers creCustomers(@RequestBody CustomerRegister crg ) {
		
		City c= cityservice.getById(crg.getCity_id());
		
		System.out.println(c.toString());
		
		CustomerType ctt 	=customerTypeService.getByid(302);
		
		System.out.println(ctt.toString());
		
		//System.out.println("Object : = "+ ctt);
		Question q=qservice.getQuestion(crg.getQuestionid());
		Login l=new Login(crg.getLogger_id(),crg.getEmail(),crg.getPassword(),crg.getAnswer(),q,ctt);
		
		System.out.println(l.toString());
		
		Login ll=loginService.savelogin(l);
		
		System.out.println(ll.toString());
		
//	    Customers cus=new Customers(crg.getCustomerid(),crg.getFname(),crg.getLname(),c,ll);
		
//		System.out.println(crg.getFname(),crg.getCity_id(),crg.getLname(),l.getId());
		
		Customers cus=new Customers(crg.getFname(),crg.getLname(),c,ll);
		
          return custserviService.createCustomers(cus);
	}
	
	
	 @GetMapping("/lastcustomer")
     public Customers getLastLogin() {
         return custserviService.findLastEntry();
     }

}


