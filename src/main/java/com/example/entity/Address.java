package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "house_number")
	private String houseNumber;
	
	@Column(name = "city")
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String houseNumber, String city) {
		super();
		this.houseNumber = houseNumber;
		this.city = city;
	}
	
	public Address(Integer id, String houseNumber, String city) {
		super();
		this.id=id;
		this.houseNumber = houseNumber;
		this.city = city;
	}
	
	public Address(){
		super();
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", houseNumber=" + houseNumber + ", city=" + city + "]";
	}
	
	
	
	
	
}
