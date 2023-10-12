package com.pharm.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharm.dao.MedicineDao;
import com.pharm.entities.Medicine;

@Service
public class MedicineServiceImplement implements MedicineService {
	
	@Autowired
	private MedicineDao medDao;
	
	//List<Medicine> list;
	
	public MedicineServiceImplement() {
	}

				//GET ALL MEDICINE
	@Override
	public List<Medicine> getmedicines() {
		
		return medDao.findAll();
	}

				//ADD MEDICINE
	@Override
	public Medicine addMedicine(Medicine medicine) {
	
		medDao.save(medicine);
		return medicine;
	}

				//GET SINGLE MEDICINE
	@Override
	public Medicine getmedicines(int medicineId) {
	
		return medDao.findById(medicineId).get();
	}

				//UPDATE MEDICINE
	@Override
	public Medicine updateMedicine(Medicine medicine) {

		medDao.save(medicine);
		return medicine;
	}

				//DELETE MEDICINE
	@Override
	public void deleteMedicine(int medicineId) {
		
		medDao.deleteById(medicineId);
	}

	

}
