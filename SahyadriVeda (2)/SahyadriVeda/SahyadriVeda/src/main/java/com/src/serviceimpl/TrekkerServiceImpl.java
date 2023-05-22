package com.src.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.dao.TrekkerRepository;
import com.src.model.Trekker;
import com.src.service.TrekkerService;

@Service
public class TrekkerServiceImpl implements TrekkerService{

	@Autowired
	TrekkerRepository trekkerRepository;

	@Override
	public Trekker saveTrekker(Trekker trekker) {
		// TODO Auto-generated method stub
		return trekkerRepository.save(trekker);
	}

	@Override
	public Trekker getTrekkerByID(int id) {
		
		Trekker trekker=trekkerRepository.findById(id).orElse(null);
		// TODO Auto-generated method stub
		return trekker;
	}

	@Override
	public Trekker update(int id) {
		Trekker trekker=trekkerRepository.findById(id).orElse(null);
			trekker.setEmail("bhonde@gmail.com");
			trekkerRepository.save(trekker);
		return trekker;
	}

	
}
