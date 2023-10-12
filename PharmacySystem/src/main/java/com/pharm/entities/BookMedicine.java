package com.pharm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BookMedicine {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String medname;
	private String username;
	private String email;
	private String mnumber;
	private String city;
	private String address;
	private int amount;
	
	//MANY TO ONE MAPPING WITH PHARMACIST
	@ManyToOne
	@JoinColumn(name="pharmacist_id", referencedColumnName="id")
	private Pharmacist pharmacist;

	
	//MANY TO ONE MAPPING WITH PHARMACIST
	@ManyToOne
	@JoinColumn(name="user_id", referencedColumnName="id")
	private UserRegister user;

		public BookMedicine() {
			super();
			// TODO Auto-generated constructor stub
		}

		public BookMedicine(int id, String medname, String username, String email, String mnumber, String city,
				String address, int amount, Pharmacist pharmacist, UserRegister user) {
			super();
			this.id = id;
			this.medname = medname;
			this.username = username;
			this.email = email;
			this.mnumber = mnumber;
			this.city = city;
			this.address = address;
			this.amount = amount;
			this.pharmacist = pharmacist;
			this.user = user;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getMedname() {
			return medname;
		}

		public void setMedname(String medname) {
			this.medname = medname;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMnumber() {
			return mnumber;
		}

		public void setMnumber(String mnumber) {
			this.mnumber = mnumber;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		public Pharmacist getPharmacist() {
			return pharmacist;
		}

		public void setPharmacist(Pharmacist pharmacist) {
			this.pharmacist = pharmacist;
		}

		public UserRegister getUser() {
			return user;
		}

		public void setUser(UserRegister user) {
			this.user = user;
		}

		@Override
		public String toString() {
			return "BookMedicine [id=" + id + ", medname=" + medname + ", username=" + username + ", email=" + email
					+ ", mnumber=" + mnumber + ", city=" + city + ", address=" + address + ", amount=" + amount
					+ ", pharmacist=" + pharmacist + ", user=" + user + "]";
		}
	
	
	

}
