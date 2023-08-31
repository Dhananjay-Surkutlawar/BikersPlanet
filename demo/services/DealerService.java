package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Bikes;
import com.example.demo.entities.City;
import com.example.demo.entities.Companies;
import com.example.demo.entities.Customers;
//import com.example.demo.entities.Customers;
import com.example.demo.entities.Dealer;
import com.example.demo.entities.Login;
//import com.example.demo.repositories.CustomerRepo;
import com.example.demo.repositories.DealerRepo;

@Service
public class DealerService {
	
	
	   @Autowired
	   DealerRepo dealerrepo;
	   
	   
	   public List<Dealer> findBycomandcity(City dct, Companies co)
	   {
		   return dealerrepo.findBycomandcity( dct, co);
	   }
	   
	   public List<Dealer> getAll()
		{
			return (List<Dealer>) dealerrepo.findAll();
		}

	   
	   public Dealer createDealer(Dealer dd) {
	        return dealerrepo.save(dd);
	    }
	   
	   
	   public List<Dealer> getDealersByCityId(City c) {
	        return dealerrepo.findByCityId(c);
	    }
	   
	   public Dealer getById(int dealer)
	    {
	    	return dealerrepo.findById(dealer).get();
	    }
	   
	 public List<Dealer> finddalerid (Login l)
	 {
		 return dealerrepo.finddealerid(l);
	 }
	 
	 public List<Dealer> allinfobylogid(Login l)
	 {
		 return dealerrepo.allinfobylogid(l);
	 }
}
