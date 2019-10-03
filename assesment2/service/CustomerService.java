package com.mydemos.service;


import com.mydemos.dao.CustomerDao;
import com.mydemos.pojo.Customer;

public class CustomerService {

	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		Customer customer = new Customer("rrrr","Sharma","HYD");
		
		
		dao.saveCustomer(customer);
		
		
	}

}
