package com.pharm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharm.entities.BookMedicine;

public interface BookMedicineDao extends JpaRepository<BookMedicine, Integer>{

}
