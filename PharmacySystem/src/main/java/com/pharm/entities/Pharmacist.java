package com.pharm.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pharmacist {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String dob;
	private String mnumber;
	private String address;
	
	//ONE TO MANY MAPPING WITH BOOK MEDICINE
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="pharmacist")
	@JsonIgnoreProperties("pharmacist")
	private List<BookMedicine> bookmed;
//	

	@Override
	public String toString() {
		return "Pharmacist [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", mnumber=" + mnumber
				+ ", address=" + address + ", bookmed=" + bookmed + "]";
	}
	public Pharmacist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pharmacist(int id, String name, String email, String dob, String mnumber, String address,
			List<BookMedicine> bookmed) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.mnumber = mnumber;
		this.address = address;
		this.bookmed = bookmed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMnumber() {
		return mnumber;
	}
	public void setMnumber(String mnumber) {
		this.mnumber = mnumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<BookMedicine> getBookmed() {
		return bookmed;
	}
	public void setBookmed(List<BookMedicine> bookmed) {
		this.bookmed = bookmed;
	}
	
	
	
	
	

}
