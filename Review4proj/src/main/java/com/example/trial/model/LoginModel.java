package com.example.trial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LoginTable")
public class LoginModel {
	
	@Id
	private int id;
	private String email;
	private String password;
	
	
	public LoginModel() {
		super();
	}
	public LoginModel(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	public int getId() {
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
	

}
