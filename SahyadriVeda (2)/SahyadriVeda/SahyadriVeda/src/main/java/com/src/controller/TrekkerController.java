package com.src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.src.model.Trekker;
import com.src.serviceimpl.TrekkerServiceImpl;

@RestController
public class TrekkerController {

	@Autowired
	TrekkerServiceImpl trekkerServiceImpl;
	
	@PostMapping(value = "/add")
	public Trekker getString(@RequestBody Trekker trekker) {
		return trekkerServiceImpl.saveTrekker(trekker);	
		
		
	}
	@PostMapping(value = "/{id}")
	public Trekker gettrekkerById(@PathVariable int id) {
		//TODO: process POST request
		
		return trekkerServiceImpl.getTrekkerByID(id);
	}
	@GetMapping(value = "/mh/{id}")
	public Trekker gettrekkerByIdsam(@PathVariable int id) {
		//TODO: process POST request
		
		return trekkerServiceImpl.update(id);
	}

	


	


}
	