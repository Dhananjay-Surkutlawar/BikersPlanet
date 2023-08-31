package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.BikeCategory;
import com.example.demo.entities.City;
import com.example.demo.entities.CustomerType;
import com.example.demo.repositories.CustomerTypeRepo;

@Service
public class CustomerTypeService {
	
	@Autowired
	CustomerTypeRepo ctrepo;
	
	public List<CustomerType> getAll()
	{
		return (List<CustomerType>) ctrepo.findAll();
	}

	
	public CustomerType saveCustomertype(CustomerType c)
	{
		return ctrepo.save(c);
	}
	
	public CustomerType getByid(int id)
	{
		CustomerType c = ctrepo.findById(id).get();
		System.out.println(c);
		return c;
	}
	
	
}
