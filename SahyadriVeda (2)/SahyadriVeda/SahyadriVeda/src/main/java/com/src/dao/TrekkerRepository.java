package com.src.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.src.model.Trekker;
@Service
public interface TrekkerRepository extends JpaRepository<Trekker,Integer>{

	Trekker save(Trekker trekker);
	
	
	/*
	 * List<Trekker> getTrekker();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Trekker getAdmin(int adharno);
	 * 
	 * 
	 * 
	 * Trekker getTrekkerById(int id);
	 */
	
}
