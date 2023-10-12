package com.pharm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharm.entities.Pharmacist;

public interface PharmacistDao extends JpaRepository<Pharmacist,Integer>{

}
