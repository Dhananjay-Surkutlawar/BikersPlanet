package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.BikeCategory;
import com.example.demo.entities.Bikes;
import com.example.demo.entities.City;
import com.example.demo.entities.Companies;
import com.example.demo.entities.CustomerType;
import com.example.demo.entities.Customers;
import com.example.demo.entities.Dealer;
import com.example.demo.entities.DealerRegester;
import com.example.demo.entities.Login;
import com.example.demo.entities.Question;
import com.example.demo.services.CityService;
import com.example.demo.services.CompaniesServices;

import com.example.demo.services.CustomerService;
import com.example.demo.services.CustomerTypeService;
import com.example.demo.services.DealerService;
import com.example.demo.services.LoginService;
import com.example.demo.services.QuestionsService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class DealerController {
	
	
	@Autowired
	DealerService dealerService;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	CityService cityservice;
	
	@Autowired
	CustomerTypeService custtypeservice;
	
	@Autowired
	CompaniesServices comservice;
	
	@Autowired
	QuestionsService qservice;
	
	
//	
//	@GetMapping("/Getdealer")
//	public List<Dealer> getDealer(@RequestParam("d_city") int d_city,@RequestParam("company") int company)
//	{
//	   //	Login dl= loginService.getById(log_id);
//		City dct= cityservice.getById(d_city);
//		Companies co= comservice.getById(company);
//		return dealerService.getDealer(dct, co);
//	}
	
	
	@GetMapping("/getdealerBycomandcity")
	public List<Dealer> findBycomandcity(@RequestParam("d_city")int d_city,@RequestParam("company") int company)
	{
		  City dct= cityservice.getById(d_city);
		  Companies co= comservice.getById(company);
		  return dealerService.findBycomandcity(dct, co);
	}
	
	@GetMapping("/Alldealers")
	public List<Dealer> getAll()
	{
		return dealerService.getAll();
	}
	
	
	@PostMapping("/insertdealer")
	public Dealer createDealer(@RequestBody DealerRegester dd)
	{
		City c=cityservice.getById(dd.getD_city());
		CustomerType ctt=custtypeservice.getByid(301);
		Question q=qservice.getQuestion(dd.getQ_id());
		Companies company=comservice.getById(dd.getCompany());
		
		Login l=new Login(dd.getLog_id(),dd.getEmail(),dd.getPassword(),dd.getAnswer(),q,ctt);
		
		Login ll=loginService.savelogin(l);
		
		Dealer deal=new Dealer(dd.getDealer_id(),dd.getOwner_name(),dd.getAddress(),dd.getMobile_no(),c,ll,company);
		
		return dealerService.createDealer(deal);
	}
	
	
	@GetMapping("/getdealerbycity")
    public List<Dealer> getDealersByCityId(@RequestParam("cityid") int cityid) {
    	
    	City cc = cityservice.getById(cityid);
    	
        return dealerService.getDealersByCityId(cc);
    }
	
	@GetMapping("/finddealerid")
	public List<Dealer> finddealerid(@RequestParam("log_id") int log_id)
	{
		Login l = loginService.getById(log_id);
		return dealerService.finddalerid(l);
	}
	
	@GetMapping ("/allinfobylogid")
	public List<Dealer> allinfobylogid(@RequestParam("log_id") int log_id)
	{
		Login l=loginService.getById(log_id);
		return dealerService.allinfobylogid(l);
	}

}
