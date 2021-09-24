package com.example.springboot;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "model")
public class CarModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int modelId;
	@Column(nullable = false, length = 50)
	public String model;
	
}
