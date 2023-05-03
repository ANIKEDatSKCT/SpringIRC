package com.example.trial.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="query_testing")
public class Querytesting {
	
	@Id
	private int tid;
	private String tname;
	private int tage;
	private long tnumber;
	private String tgender;
	private String temail;
	private String tpassword;
	private String tstatus;
	private String tjob;
	private String tsalary;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTage() {
		return tage;
	}
	public void setTage(int tage) {
		this.tage = tage;
	}
	public long getTnumber() {
		return tnumber;
	}
	public void setTnumber(long tnumber) {
		this.tnumber = tnumber;
	}
	public String getTgender() {
		return tgender;
	}
	public void setTgender(String tgender) {
		this.tgender = tgender;
	}
	public String getTemail() {
		return temail;
	}
	public void setTemail(String temail) {
		this.temail = temail;
	}
	public String getTpassword() {
		return tpassword;
	}
	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}
	public String getTstatus() {
		return tstatus;
	}
	public void setTstatus(String tstatus) {
		this.tstatus = tstatus;
	}
	public String getTjob() {
		return tjob;
	}
	public void setTjob(String tjob) {
		this.tjob = tjob;
	}
	public String getTsalary() {
		return tsalary;
	}
	public void setTsalary(String tsalary) {
		this.tsalary = tsalary;
	}
	
	

}
