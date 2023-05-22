package com.src.service;

import java.util.List;

import com.src.model.Admin;

public interface AdminService {

	Admin saveAdmin(Admin admin);

	Admin getById(int id);

	List<Admin> getAdmins();

}
