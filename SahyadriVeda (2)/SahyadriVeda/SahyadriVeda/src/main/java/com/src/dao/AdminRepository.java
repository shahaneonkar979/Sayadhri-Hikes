package com.src.dao;

import javax.persistence.Id;
import javax.websocket.server.ServerEndpoint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.src.model.Admin;
@Service
public interface AdminRepository extends JpaRepository<Admin, Integer>{

	

	
}
