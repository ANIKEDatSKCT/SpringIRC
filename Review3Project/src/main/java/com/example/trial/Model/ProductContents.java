package com.example.trial.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productcontents")
public class ProductContents {
	
	@Id
	private int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	private String fatcontent;
	private String ironcontent;
	private String carbohydratescontent;
	private String sugarcontent;
	private String cholesterolcontent;
	private String vitamnsavailable;
	private String productvariety;
	

	
	public String getFatcontent() {
		return fatcontent;
	}
	public void setFatcontent(String fatcontent) {
		this.fatcontent = fatcontent;
	}
	public String getIroncontent() {
		return ironcontent;
	}
	public void setIroncontent(String ironcontent) {
		this.ironcontent = ironcontent;
	}
	public String getCarbohydratescontent() {
		return carbohydratescontent;
	}
	public void setCarbohydratescontent(String carbohydratescontent) {
		this.carbohydratescontent = carbohydratescontent;
	}
	public String getSugarcontent() {
		return sugarcontent;
	}
	public void setSugarcontent(String sugarcontent) {
		this.sugarcontent = sugarcontent;
	}
	public String getCholesterolcontent() {
		return cholesterolcontent;
	}
	public void setCholesterolcontent(String cholesterolcontent) {
		this.cholesterolcontent = cholesterolcontent;
	}
	public String getVitamnsavailable() {
		return vitamnsavailable;
	}
	public void setVitamnsavailable(String vitamnsavailable) {
		this.vitamnsavailable = vitamnsavailable;
	}
	public String getProductvariety() {
		return productvariety;
	}
	public void setProductvariety(String productvariety) {
		this.productvariety = productvariety;
	}
	
	
	
	

}
