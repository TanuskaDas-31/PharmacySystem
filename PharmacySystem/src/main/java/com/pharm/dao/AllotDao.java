package com.pharm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharm.entities.AllotStock;

public interface AllotDao extends JpaRepository<AllotStock, Integer>{

}
