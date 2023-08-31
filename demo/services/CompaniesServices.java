package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entities.Companies;
import com.example.demo.repositories.CompaniesRepo;

@Service

public class CompaniesServices {
	
	@Autowired 
	CompaniesRepo comrepo;
	
	public List<Companies> getAll()
	{
		return (List<Companies>) comrepo.findAll();
	}

	public Companies getById(int company) {
		
		return comrepo.findById(company).get();
	}

}
