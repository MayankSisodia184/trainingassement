package com.mydemos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mydemos.dbutil.DbConn;
import com.mydemos.pojo.Customer;

public class CustomerDao {
	
	public int generateCustID() {
		int seq;
		try {
		Connection con = DbConn.getConnection();
		
		String sql = "select cust_seq.nextval from dual";
		PreparedStatement stat = con.prepareStatement(sql);
		ResultSet rs = stat.executeQuery();
		
		if (rs.next()){
			return rs.getInt(1);
		}
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
	
	
	public String saveCustomer(Customer customer) {
		try {
			
			String seq_id = "";
			
			Connection con = DbConn.getConnection();
			String sql = "insert into Customer values(?,?,?,?)";
			PreparedStatement stat = con.prepareStatement(sql);
			int seqNum = generateCustID();
			if (seqNum<=9) {
			seq_id+=customer.getCustName().substring(0, 2)+customer.getCustLastName().substring(0, 2)+"00"+seqNum+ " "+customer.getAddress();
			customer.setCustid(seq_id);
			}
			else if(seqNum>=10  && seqNum<=99) {
				seq_id+=customer.getCustName().substring(0, 2)+customer.getCustLastName().substring(0, 2)+"0"+seqNum;
				customer.setCustid(seq_id);
			}
			stat.setString(1, customer.getCustName());
			stat.setString(2, customer.getCustLastName());
			stat.setString(3, customer.getCustid());
			stat.setString(4, customer.getAddress());
			
			int res = stat.executeUpdate();
			if (res>0) {
				return "Customer Saved";
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Customer Not Saved";
	}
	

}



