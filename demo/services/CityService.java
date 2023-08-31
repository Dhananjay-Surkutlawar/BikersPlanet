package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.City;
import com.example.demo.entities.Login;
import com.example.demo.repositories.CityRepository;

@Service
public class CityService {
	
	@Autowired
	CityRepository crepo;
	
	public List<City> getAll()
	{
		return (List<City>) crepo.findAll();
	}

	public City saveCity(@RequestBody City c)
	{
		return crepo.save(c);
	}
	
	 public City getById(int citynid)
	    {
	    	return crepo.findById(citynid).get();
	    }
	 
//	 public City getCityid(int id)
//	 {
//		 return crepo.findById(id).get();
//	 }
	    
}
