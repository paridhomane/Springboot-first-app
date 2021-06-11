package com.springboot.springbootfirstapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@PropertySource(ignoreResourceNotFound = true, value = "classpath:application.properties")
@RestController


public class WelcomeController {
	
	
	 
	 @Value("${my.address}")
	 private String Address;
	   
	 
	 @Value("${my.city}")
	 private String City;
	   
	 
	 @Value("${my.state}")
	 private String State;
	   
	 
	 @Value("${my.pin}")
	 private String Pin;
	   
	 
	
	  @GetMapping("/address") 
	  public String Address() {
	      return Address;
	     
	   }
	  

	 public String City() {
	      return City;
	   }
	 public String State() {
	      return State;
	   }
	 public String Pin() {
	      return Pin;
	   }
	
	  
	  
	}

