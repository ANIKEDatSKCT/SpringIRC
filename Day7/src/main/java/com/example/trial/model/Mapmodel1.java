package com.example.trial.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Mapmodel1 {
	
	@Id
	private int id;
	private String name;
	private int rollno;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Mapmodel2> m2;
	
	public List<Mapmodel2> getM2() {
		return m2;
	}
	public void setM2(List<Mapmodel2> m2) {
		this.m2 = m2;
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
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

}
