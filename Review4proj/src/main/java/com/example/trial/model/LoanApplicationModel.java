package com.example.trial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LoanApplicationTable")
public class LoanApplicationModel {
	
	
	
	@Id
	private int loanid;
	private String loantype;
	private String applicantname;
	private String applicantaddress;
	private String applicantmobile;
	private String applicantemail;
	private String applicantaadhaar;
	private String applicanrpan;
	private String applicantsalary;
	private String loanamountrequired;
	private String loanrepaymentmonths;
	
	
	
	
	public LoanApplicationModel() {
		super();
	}
	public LoanApplicationModel(int loanid, String loantype, String applicantname, String applicantaddress,
			String applicantmobile, String applicantemail, String applicantaadhaar, String applicanrpan,
			String applicantsalary, String loanamountrequired, String loanrepaymentmonths) {
		super();
		this.loanid = loanid;
		this.loantype = loantype;
		this.applicantname = applicantname;
		this.applicantaddress = applicantaddress;
		this.applicantmobile = applicantmobile;
		this.applicantemail = applicantemail;
		this.applicantaadhaar = applicantaadhaar;
		this.applicanrpan = applicanrpan;
		this.applicantsalary = applicantsalary;
		this.loanamountrequired = loanamountrequired;
		this.loanrepaymentmonths = loanrepaymentmonths;
	}
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getApplicantname() {
		return applicantname;
	}
	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname;
	}
	public String getApplicantaddress() {
		return applicantaddress;
	}
	public void setApplicantaddress(String applicantaddress) {
		this.applicantaddress = applicantaddress;
	}
	public String getApplicantmobile() {
		return applicantmobile;
	}
	public void setApplicantmobile(String applicantmobile) {
		this.applicantmobile = applicantmobile;
	}
	public String getApplicantemail() {
		return applicantemail;
	}
	public void setApplicantemail(String applicantemail) {
		this.applicantemail = applicantemail;
	}
	public String getApplicantaadhaar() {
		return applicantaadhaar;
	}
	public void setApplicantaadhaar(String applicantaadhaar) {
		this.applicantaadhaar = applicantaadhaar;
	}
	public String getApplicanrpan() {
		return applicanrpan;
	}
	public void setApplicanrpan(String applicanrpan) {
		this.applicanrpan = applicanrpan;
	}
	public String getApplicantsalary() {
		return applicantsalary;
	}
	public void setApplicantsalary(String applicantsalary) {
		this.applicantsalary = applicantsalary;
	}
	public String getLoanamountrequired() {
		return loanamountrequired;
	}
	public void setLoanamountrequired(String loanamountrequired) {
		this.loanamountrequired = loanamountrequired;
	}
	public String getLoanrepaymentmonths() {
		return loanrepaymentmonths;
	}
	public void setLoanrepaymentmonths(String loanrepaymentmonths) {
		this.loanrepaymentmonths = loanrepaymentmonths;
	}
	
	
	

}
