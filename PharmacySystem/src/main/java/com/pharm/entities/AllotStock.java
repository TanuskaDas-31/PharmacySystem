package com.pharm.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class AllotStock {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String medicinename;
	private String pharmacistname;
	private int quantity;
	
	
	@OneToMany(mappedBy="allotstock")
	@JsonIgnore
	private List<Medicine> medicinelist;


	public AllotStock() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AllotStock(int id, String medicinename, String pharmacistname, int quantity, List<Medicine> medicinelist) {
		super();
		this.id = id;
		this.medicinename = medicinename;
		this.pharmacistname = pharmacistname;
		this.quantity = quantity;
		this.medicinelist = medicinelist;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMedicinename() {
		return medicinename;
	}


	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}


	public String getPharmacistname() {
		return pharmacistname;
	}


	public void setPharmacistname(String pharmacistname) {
		this.pharmacistname = pharmacistname;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public List<Medicine> getMedicinelist() {
		return medicinelist;
	}


	public void setMedicinelist(List<Medicine> medicinelist) {
		this.medicinelist = medicinelist;
	}


	@Override
	public String toString() {
		return "AllotStock [id=" + id + ", medicinename=" + medicinename + ", pharmacistname=" + pharmacistname
				+ ", quantity=" + quantity + ", medicinelist=" + medicinelist + "]";
	}
	
}
