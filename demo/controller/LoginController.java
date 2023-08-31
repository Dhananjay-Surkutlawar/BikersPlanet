package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Login;
import com.example.demo.entities.LoginCheck;

import com.example.demo.services.LoginService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class LoginController {

    @Autowired
    LoginService loginService;

      
    @PostMapping("/checklogin")
    public Login checklogin(@RequestBody LoginCheck lcheck ) 
    {
    	return loginService.getLogin(lcheck.getEmail(),lcheck.getPassword() );
    }
    
    
        @PostMapping("/insertlogin")
        public Login createLogin(@RequestBody Login login)
        {
        return loginService.createLogin(login);
        }
        
        @GetMapping("/lastlogin")
        public Login getLastLogin() {
            return loginService.findLastEntry();
        }
}