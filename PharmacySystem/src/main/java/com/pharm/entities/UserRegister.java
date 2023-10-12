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
public class UserRegister {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String dob;
	private String mnumber;
	private String city;
	private String address;
	private String password;
	private String userrole;
	
	//ONE TO MANY WITH BOOK MEDICINE
	@OneToMany(cascade=CascadeType.ALL ,mappedBy="user")
	@JsonIgnoreProperties("user")
	private List<BookMedicine> bookmed;
	
	
	public UserRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRegister(int id, String fname, String lname, String email, String dob, String mnumber, String city,
			String address, String password, String userrole, List<Medicine> medicinelist, List<BookMedicine> bookmed) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.dob = dob;
		this.mnumber = mnumber;
		this.city = city;
		this.address = address;
		this.password = password;
		this.userrole = userrole;
		this.bookmed = bookmed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public List<BookMedicine> getBookmed() {
		return bookmed;
	}

	public void setBookMedicine(List<BookMedicine> bookmed) {
		this.bookmed = bookmed;
	}

	@Override
	public String toString() {
		return "UserRegister [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", dob=" + dob
				+ ", mnumber=" + mnumber + ", city=" + city + ", address=" + address + ", password=" + password
				+ ", userrole=" + userrole + ", bookmed=" + bookmed + "]";
	}
	
	
	
}
