package com.example.trial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="businfo")
public class Day4 {
	
	@Id
	private int id;
	@Column(name="drop_spot")
	private String placename;
	
	private String time;
	
	private String busname;
	
	private String startpoint;
	
	private String endpoint;
	
	private String busnum;
	
	private String total_no_of_passengers;
	
	private String busownership;
	
	private String route;
	
	private String username;
	
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBusnum() {
		return busnum;
	}
	public void setBusnum(String busnum) {
		this.busnum = busnum;
	}
	public String getTotal_no_of_passengers() {
		return total_no_of_passengers;
	}
	public void setTotal_no_of_passengers(String total_no_of_passengers) {
		this.total_no_of_passengers = total_no_of_passengers;
	}
	public String getBusownership() {
		return busownership;
	}
	public void setBusownership(String busownership) {
		this.busownership = busownership;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlacename() {
		return placename;
	}
	public void setPlacename(String placename) {
		this.placename = placename;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getBusname() {
		return busname;
	}
	public void setBusname(String busname) {
		this.busname = busname;
	}
	public String getStartpoint() {
		return startpoint;
	}
	public void setStartpoint(String startpoint) {
		this.startpoint = startpoint;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	
	
	

}
