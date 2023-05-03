package com.example.trial.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="courselink")
public class Courselink {
	@Id
	private int clid;
	private String curl;
	public int getClid() {
		return clid;
	}
	public void setClid(int clid) {
		this.clid = clid;
	}
	public String getCurl() {
		return curl;
	}
	public void setCurl(String curl) {
		this.curl = curl;
	}
	

}
