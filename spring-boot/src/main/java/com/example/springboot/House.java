package com.example.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "house")
public class House {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int houseId;
	@Column(nullable = false, length = 50)
	public String neighborhood;
	@Column(nullable = false, length = 50)
	public String street;
	@Column(nullable = false)
	public Long buildingNo;
	@Column(nullable = false)
	public int doorNumber;
	@Column(nullable = false, length = 30)
	public String town;
	@Column(nullable = false, length =30 )
	public String city;
	@Column(nullable=false)
	public int year;

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}



	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Long getBuildingNo() {
		return buildingNo;
	}

	public void setBuildingNo(Long buildingNo) {
		this.buildingNo = buildingNo;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
