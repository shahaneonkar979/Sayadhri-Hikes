package com.src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.src.serviceimpl.AdminServiceImpl;

@RestController
public class AdminController 
{
	@Autowired
	AdminServiceImpl adminserviceImpl;
	/*
	 * @GetMapping("/id") public Admin getAdminById(int id ,Model model) { return
	 * adminserviceImpl.getById(id); }
	 * 
	 * @PostMapping("/a") public Admin saveAdmin(Admin admin) { return
	 * adminserviceImpl.saveAdmin(admin); }
	 * 
	 * @GetMapping("/list") public List<Admin> getListAdmin() { return
	 * adminserviceImpl.getAdmins();
	 * 
	 * }
	 */
}
