package com.src.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.dao.AdminRepository;
import com.src.model.Admin;
import com.src.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public Admin saveAdmin(Admin admin)
	{
		return adminRepository.save(admin);
	}
	@Override
	public Admin getById(int id) {
		// TODO Auto-generated method stub
		return adminRepository.findById(id).orElse(null);
	}
	@Override
	public List<Admin>getAdmins()
	{
		return adminRepository.findAll();
	}
	
}
