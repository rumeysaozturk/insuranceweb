package com.example.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asigorta")
public class ArabaSigorta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int cinsuranceId;
	@Column(nullable=false)
	public String tc;
	@Column(nullable=false)
	public String plaque;
	@Column
	public double offer;
	
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	public String getPlaque() {
		return plaque;
	}
	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}
	public int getCinsuranceId() {
		return cinsuranceId;
	}
	public void setCinsuranceId(int cinsuranceId) {
		this.cinsuranceId = cinsuranceId;
	}
	public double getOffer() {
		return offer;
	}
	public void setOffer(double offer) {
		this.offer = offer;
	}

}
