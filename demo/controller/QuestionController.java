package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.CustomerType;
import com.example.demo.entities.Question;
import com.example.demo.services.CustomerTypeService;
import com.example.demo.services.QuestionsService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class QuestionController
{
	
	 @Autowired
     QuestionsService qservice;
     
	 
	 @GetMapping("/AllQuestion")
      public List<Question> getall()
      {
    	  return qservice.getAll();
      }
 
}
