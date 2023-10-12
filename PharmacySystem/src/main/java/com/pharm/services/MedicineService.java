package com.pharm.services;

import java.util.List;

import com.pharm.entities.Medicine;

public interface MedicineService {
	
	//GET MEDICINE
	public List<Medicine> getmedicines();
	
	
	//GET SINGLE MEDICINE
	public Medicine getmedicines(int medicineId);
	
	//ADD NEW MEDICINE
	public Medicine addMedicine(Medicine medicine);
	
	//UPDATE MEDICINE
	public Medicine updateMedicine(Medicine medicine);
	
	//DELETE MEDICINE
	public void deleteMedicine(int medicineId);

}
