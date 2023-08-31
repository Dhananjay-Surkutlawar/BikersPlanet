package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.City;
import com.example.demo.entities.Dealer;
import com.example.demo.entities.Testrides;
import com.example.demo.repositories.TestrideRepo;

@Service


public class TestrideServices {
	
	@Autowired
	TestrideRepo testrepo;
	
	
	public List<Testrides> getall()
	{
		return (List<Testrides>) testrepo.findAll();
	
	}
	
	
	 public Testrides createTestride(Testrides dd) {
	        return testrepo.save(dd);
	    }
	
	 public List<Testrides> findtestridebydealerid(Dealer d)
		{
			return testrepo.findtestridebydealerid(d);
		}
}
