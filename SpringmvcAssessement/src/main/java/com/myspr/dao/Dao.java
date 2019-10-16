package com.myspr.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myspr.model.Laundary;

@Component
public class Dao {

	@Autowired
	SessionFactory sessionFactory ;
	
	@Transactional
	public void saveLaundary(Laundary laundary)
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(laundary);
	
		
		
	}
	
	@Transactional
	public ArrayList<Laundary> viewLaundary()
	{
		Session session=sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Laundary");
		@SuppressWarnings("unchecked")
		ArrayList<Laundary> laundary=(ArrayList<Laundary>)query.list();
		
	
	return laundary ;
	
	
    }
	
	@Transactional
	public Laundary updateLaundary(String type,int num) 
	{
		
		Session session=sessionFactory.getCurrentSession();
		Laundary laund = (Laundary)session.get(Laundary.class,type);
		laund.setNum(num);
		laund.setBill(num*10);
		session.saveOrUpdate(laund);
		return  laund;
		
		
	    
	}
	
	@Transactional
	public String deleteLaundary(String type)
	{
		Session session = sessionFactory.getCurrentSession();
		Laundary laud= (Laundary)session.get(Laundary.class,type);
	    session.delete(laud);
	    return "Deleted";
	}

	@Transactional
	public ArrayList<Laundary> searchLaundary(String username)
	{
		Session  session = sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Laundary r where r.username like '%"+username+"%'");
		ArrayList<Laundary> laundary=(ArrayList<Laundary>)query.list();
		
		return laundary;

	}
	
	
	
	
	
}
