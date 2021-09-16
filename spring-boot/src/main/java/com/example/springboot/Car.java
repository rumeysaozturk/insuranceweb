package com.example.springboot;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int carId;
	@Column(nullable = false, length = 10)
	public String plaque;
	@Column(nullable = false, length = 30)
	public String brand;
	@Column(nullable = false, length = 30)
	public String model;
	@Column(nullable = false)
	public Long year;
	@Column(nullable=false)
	public char accident;
	

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getPlaque() {
		return plaque;
	}

	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}

	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public char getAccident() {
		return accident;
	}

	public void setAccident(char accident) {
		this.accident = accident;
	}
	
	
}
