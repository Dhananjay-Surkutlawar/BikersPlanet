package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.City;
import com.example.demo.entities.CustomerType;
import com.example.demo.entities.Customers;
import com.example.demo.entities.Login;
import com.example.demo.repositories.CustomerRepo;

@Service
public class CustomerService {

	   @Autowired
	   CustomerRepo custrepo;
	   
	   
	   public Customers getCustomers(Login l,City ct)
	   {
		   return custrepo.getCustomer(l, ct);
	   }
	   
	   
	    public Customers createCustomers(Customers customers) {
	        return custrepo.save(customers);
	    }
	
	    
	    public Customers getById(int customer)
	    {
	    	return custrepo.findById(customer).get();
	    }
	    
	    public Customers findLastEntry() {
	        return custrepo.findLastEntry();
	    }
}
