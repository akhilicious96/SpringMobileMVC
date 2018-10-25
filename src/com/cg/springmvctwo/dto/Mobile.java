package com.cg.springmvctwo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MobileOneData")
public class Mobile {
	
	@Id
	@Column(name="mob_id")
	Integer mobId;
	
	@Column(name="mob_name")
	String mobName;
	
	@Column(name="mob_price")
	Double mobPrice;
	
	@Column(name="mob_cato")
	String mobCategory;
	
	@Column(name="mob_online")
	String mobAvail;
	
	
	public Mobile() {
		
	}
	
	

	public Mobile(Integer mobId, String mobName, Double mobPrice, String mobCatogory, String mobAvail) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.mobPrice = mobPrice;
		this.mobCategory = mobCatogory;
		this.mobAvail= mobAvail;
	}



	public String getMobAvail() {
		return mobAvail;
	}



	public void setMobAvail(String mobAvail) {
		this.mobAvail = mobAvail;
	}



	public Integer getMobId() {
		return mobId;
	}
	
	public void setMobId(Integer mobId) {
		this.mobId = mobId;
	}
	
	public String getMobName() {
		return mobName;
	}
	
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	
	public Double getMobPrice() {
		return mobPrice;
	}
	
	public void setMobPrice(Double mobPrice) {
		this.mobPrice = mobPrice;
	}
	
	public String getMobCategory() {
		return mobCategory;
	}
	
	public void setMobCategory(String mobCategory) {
		this.mobCategory = mobCategory;
	}
	
	
	
}
