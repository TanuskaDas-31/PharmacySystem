package com.pharm.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharm.dao.PharmacistDao;
import com.pharm.entities.BookMedicine;
import com.pharm.entities.Pharmacist;

@Service
public class PharmacistServiceImplement implements PharmacistService {
	
	@Autowired
	private PharmacistDao pharmDao;
	
	public PharmacistServiceImplement() {
	}

				//GET ALL PHARMACIST
	@Override
	public List<Pharmacist> getpharma() {
		return pharmDao.findAll();
	}

				//ADD NEW PHARMACIST
	@Override
	public Pharmacist addPharmacist(Pharmacist pharmacist) {
		
		for(BookMedicine bookmed : pharmacist.getBookmed()) {
			bookmed.setPharmacist(pharmacist);
		}
		pharmacist.setBookmed(pharmacist.getBookmed());
		pharmDao.save(pharmacist);
		return pharmacist;
	}

				//UPDATE PHARMACIST
	@Override
	public Pharmacist updatePharmacist(Pharmacist pharmacist) {

		pharmDao.save(pharmacist);
		return pharmacist;
	}

				//GET SINGLE PHARMACIST
	@Override
	public Pharmacist getpharma(int pharmacistId) {

		return pharmDao.findById(pharmacistId).get();
	}
		
				//DELETE PHARMACIST
	@Override
	public void deletePharmacist(int pharmacistId) {
		pharmDao.deleteById(pharmacistId);
		
	}

}
