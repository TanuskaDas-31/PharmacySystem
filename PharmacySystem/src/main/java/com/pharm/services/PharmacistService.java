package com.pharm.services;

import java.util.List;

import com.pharm.entities.Pharmacist;

public interface PharmacistService {
	
	//GET ALL PHARMACIST
	public List<Pharmacist> getpharma();
	
	//GET SINGLE PHARMACIST
	public Pharmacist getpharma(int pharmacistId);
	
	//ADD NEW PHARMACIST
	public Pharmacist addPharmacist(Pharmacist pharmacist);
	
	//UPDATE PHARMACIST
	public Pharmacist updatePharmacist(Pharmacist pharmacist);
	
	//DELETE PHARMACIST
	public void deletePharmacist(int pharmacistId);
	

}
