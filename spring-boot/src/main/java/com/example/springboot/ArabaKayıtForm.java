package com.example.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ArabaKayıtForm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String plaque;
	public String brand;
	public String model;
	public String color;
	public Long year;
	public char accident;

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
