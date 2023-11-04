package com.aman.web.entity;

import com.aman.web.enums.UserType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String email;
	private String password;
	private UserType userType;
	public User() {
	}
	public User(int id, String email, String password, UserType userType) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}

}
