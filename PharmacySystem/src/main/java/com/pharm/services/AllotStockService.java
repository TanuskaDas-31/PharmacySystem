package com.pharm.services;

import java.util.List;

import com.pharm.entities.AllotStock;

public interface AllotStockService {
	
	//GET ALL ALLOT STOCKS
	public List<AllotStock> getallot();
	
	//GET SINGLE STOCK
	public AllotStock getallot(int allotId);
	
	//ADD NEW STOCK
	public AllotStock addAllot(AllotStock allotstock);
	
	//UPDATE STOCK
	public AllotStock updateAllot(AllotStock allotstock);

	//DELETE STOCK
	public void deleteAllot(int allotId);
}
