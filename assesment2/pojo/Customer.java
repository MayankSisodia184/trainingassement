package com.mydemos.pojo;

public class Customer {

	
	private String custName;
	private String custLastName;
	private String custid;
	private String address;
	
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustLastName() {
		return custLastName;
	}
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}
	
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	
	public Customer() {

	}
	

	public Customer(String custName, String custLastName, String address) {
		super();
		this.custName = custName;
		this.custLastName = custLastName;
		this.address = address;
	}
	@Override
	public String toString() {
	return custName+" "+custLastName+" "+custid+" "+address;
	}
}
