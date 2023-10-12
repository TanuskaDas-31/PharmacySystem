package com.pharm.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharm.dao.AllotDao;
import com.pharm.entities.AllotStock;

@Service
public class AllotStockServiceImplement implements AllotStockService {
	
	@Autowired
	private AllotDao allotDao;
	
	public AllotStockServiceImplement() {

	}

			//GET ALL STOCK
	@Override
	public List<AllotStock> getallot() {
	
		return allotDao.findAll();
	}

				//GET SINGLE ALLOT STOCK
	@Override
	public AllotStock getallot(int allotId) {

		return allotDao.findById(allotId).get();
	}

				//ADD NEW STOCK
	@Override
	public AllotStock addAllot(AllotStock allotstock) {
		allotDao.save(allotstock);
		return allotstock;
	}

				//UPDATE STOCK
	@Override
	public AllotStock updateAllot(AllotStock allotstock) {
		
		allotDao.save(allotstock);
		return allotstock;
	}

				//DELETE ALLOT STOCK
	@Override
	public void deleteAllot(int allotId) {
		
		allotDao.deleteById(allotId);
	}

}
