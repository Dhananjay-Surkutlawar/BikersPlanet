package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Colors;
import com.example.demo.repositories.ColorsRepo;

@Service
public class ColorsService {
	
	@Autowired
	ColorsRepo crrepo;
	
	public List<Colors> getAll()
	{
		return (List<Colors>) crrepo.findAll();
	}
}
