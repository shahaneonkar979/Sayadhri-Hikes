package com.src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.src.model.Trekking;
import com.src.service.TrekkingService;

@RestController
public class TrekkingController 
{
	
	@Autowired
	TrekkingService trekkingservice;

	
	@PostMapping("/addtrekker")
	public Trekking addTrekking(@RequestBody Trekking trekking)
	{
		return trekkingservice.saveTrekking(trekking);
	}
}
