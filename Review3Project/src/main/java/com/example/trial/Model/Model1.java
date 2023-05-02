package com.example.trial.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class Model1 {
	@Id
	private int productid;
	private String productname;
	private String productcompany;
	private String productprice;
	@Column(name="founding")
	private String productmanufacturedate;
	@Column(name="averageexpierydate")
	private String productexpierydate;
	private String productcompanyreview;
	
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<ProductContents> prodetails;
	
	
	
	public List<ProductContents> getProdetails() {
		return prodetails;
	}
	public void setProdetails(List<ProductContents> prodetails) {
		this.prodetails = prodetails;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcompany() {
		return productcompany;
	}
	public void setProductcompany(String productcompany) {
		this.productcompany = productcompany;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	public String getProductmanufacturedate() {
		return productmanufacturedate;
	}
	public void setProductmanufacturedate(String productmanufacturedate) {
		this.productmanufacturedate = productmanufacturedate;
	}
	public String getProductexpierydate() {
		return productexpierydate;
	}
	public void setProductexpierydate(String productexpierydate) {
		this.productexpierydate = productexpierydate;
	}
	public String getProductcompanyreview() {
		return productcompanyreview;
	}
	public void setProductcompanyreview(String productcompanyreview) {
		this.productcompanyreview = productcompanyreview;
	}
	
	

}
