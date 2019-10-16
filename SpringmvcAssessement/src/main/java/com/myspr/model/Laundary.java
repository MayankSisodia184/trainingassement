package com.myspr.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laundary {

	@Id
	String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	int num;
	String type;
	int bill;
	
	
	
	
	}
