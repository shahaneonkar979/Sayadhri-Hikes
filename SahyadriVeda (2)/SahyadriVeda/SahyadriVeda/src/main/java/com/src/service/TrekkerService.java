package com.src.service;

import java.util.List;

import com.src.model.Trekker;

public interface TrekkerService {

	
	Trekker saveTrekker(Trekker trekker);
	
	Trekker getTrekkerByID(int id);
	
	Trekker update(int id);

}
