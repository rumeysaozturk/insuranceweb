package com.example.springboot;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
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
	 @Column(nullable = false)
	private Date date;
	 
	
	 
	public String getTc() {
			return tc;
		}

		public void setTc(String tc) {
			this.tc = tc;
		}

	

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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



	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
