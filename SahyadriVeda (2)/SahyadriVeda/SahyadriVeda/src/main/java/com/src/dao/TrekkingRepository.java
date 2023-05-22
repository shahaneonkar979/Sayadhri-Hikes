package com.src.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.src.model.Trekking;
@Service
public interface TrekkingRepository extends JpaRepository<Trekking, Integer>{

}
