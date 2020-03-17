package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.FBHibernateDAO;
import com.example.demo.models.Flight;

@RestController
@RequestMapping("hibernate/")
public class HibernateController {
	
	@Autowired
	FBHibernateDAO  dao;
	
	@GetMapping("/searchFlights")
	public List<Flight> getSearchedFlights(){
		return dao.findAllFlights();		
	}
	
	@GetMapping("/searchFlight/{id}")
	public Flight getSearchFlight(@PathVariable long id){
		return dao.findFlightById(id);		
	}
	
	@PostMapping("/addFlight")
	public long addFlight(@RequestBody Flight flight){
		return dao.addFlight(flight);		
	}
	
	@GetMapping("/addFlightDetails")
	public long addFlightDetails(){
		return dao.addFlightDetails();		
	}
	
	@GetMapping("/sayHi")
	public String sayHi(){
		return "Hi";		
	}

}
