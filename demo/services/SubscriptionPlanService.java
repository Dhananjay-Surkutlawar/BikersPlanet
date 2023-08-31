package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.City;
import com.example.demo.entities.SubscriptionPlan;
import com.example.demo.repositories.CityRepository;
import com.example.demo.repositories.SubscriptionPlanRepo;

@Service
public class SubscriptionPlanService {

	
	@Autowired
	SubscriptionPlanRepo subplanrepo;
	
	public List<SubscriptionPlan> getAll()
	{
		return (List<SubscriptionPlan>) subplanrepo.findAll();
	}

	public SubscriptionPlan savePlan(@RequestBody SubscriptionPlan sp)
	{
		return subplanrepo.save(sp);
	}
	
}
