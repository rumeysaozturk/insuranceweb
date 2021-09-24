package com.example.springboot;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "color")
public class CarColors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int colorId;
	@Column(nullable = false, length = 50)
	public String color;
	
}
