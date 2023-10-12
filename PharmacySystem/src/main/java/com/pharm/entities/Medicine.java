package com.pharm.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Medicine {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String category;
	private String company;
	private int price;
	private int quantity;
	private String description;
	
	
			//MANY TO ONE MAPPING FOR ALLOT STOCK
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="allotstock_id", referencedColumnName="id")
	private AllotStock allotstock;

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicine(int id, String name, String category, String company, int price, int quantity, String description,
			UserRegister user, AllotStock allotstock) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.company = company;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.allotstock = allotstock;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AllotStock getAllotstock() {
		return allotstock;
	}

	public void setAllotstock(AllotStock allotstock) {
		this.allotstock = allotstock;
	
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", category=" + category + ", company=" + company + ", price="
				+ price + ", quantity=" + quantity + ", description=" + description + ", allotstock="
				+ allotstock + "]";
	}
	
	
}		


