package com.pharm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharm.entities.Medicine;

public interface MedicineDao extends JpaRepository<Medicine, Integer>{

}
