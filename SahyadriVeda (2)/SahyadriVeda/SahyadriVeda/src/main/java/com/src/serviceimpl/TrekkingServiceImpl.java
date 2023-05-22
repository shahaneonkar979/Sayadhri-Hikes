package com.src.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.dao.TrekkingRepository;
import com.src.model.Trekking;
import com.src.service.TrekkingService;
@Service
public class TrekkingServiceImpl  implements TrekkingService{

	@Autowired
	TrekkingRepository trekkingrepository;
	
	@Override
	public Trekking saveTrekking(Trekking trekking)
	{
		return trekkingrepository.save(trekking);
	}
}
