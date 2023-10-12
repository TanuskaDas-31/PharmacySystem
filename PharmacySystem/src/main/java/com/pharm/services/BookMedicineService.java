package com.pharm.services;

import java.util.List;

import com.pharm.entities.BookMedicine;

public interface BookMedicineService {
	
	//GET ALL BOOKED MEDICINE
	public List<BookMedicine> getbookmed();
	
	//GET SINGLE BOOKED MEDICINE
	public BookMedicine getbookmed(int medId);
	
	//ADD NEW BOOKED MEDICINE
	public BookMedicine addbookmed(BookMedicine medbook);

}
