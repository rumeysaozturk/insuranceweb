package com.example.springboot;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 @Column(nullable = false,length = 45)
	private String name;
	
	@Column(nullable = false,length = 45)
	private String surname;
	 @Column(nullable = false,length = 11)
	private String tc;
	 @Column(nullable = false, unique = true, length = 11)
	private String phoneNumber;
	 @Column(nullable = false,length = 1)
	private char gender;
	 @Column(nullable = false,  length = 45)
	private String insuranceType;
	 @Column(nullable = false)
	private Date date;
	 @Column
	 private Date lastdate;
	 
	 public Date getLastdate() {
		return lastdate;
	}

	public void setLastdate(Date lastdate) {
		this.lastdate=lastdate;

	}
	 
	public String getTc() {
			return tc;
		}

		public void setTc(String tc) {
			this.tc = tc;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
