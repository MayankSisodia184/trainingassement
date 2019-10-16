package com.myspr.demo;


import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.security.auth.login.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspr.model.Laundary;
import com.myspr.dao.Dao;


	
	@Controller
	public class HomeController {
		
		
		@RequestMapping(value = "/")
		public String home(Locale locale, Model model) {
			
			
			return "home";
		}
		
		@Autowired
		Dao dao;
		
		
		@RequestMapping(value = "/saveLaundary")
		public String saveLaundary(@ModelAttribute Laundary laundary, Model model  )
		{
			
			
			int x = laundary.getNum();
			laundary.setBill(x*10);
			dao.saveLaundary(laundary);
			model.addAttribute("user" ,laundary.getUsername());
			model.addAttribute("num", laundary.getNum() );
			model.addAttribute("type" , laundary.getType());
			model.addAttribute("bill" ,laundary.getBill());  
			return "Display";
			
		}
		
		Laundary laundary = new Laundary();
		@RequestMapping(value = "/viewLaundary")
		public String viewLaundary(Model model)
		{
			model.addAttribute("abc",dao.viewLaundary());
			  return "viewLaundary";
			
		}
		@RequestMapping(value = "/updated")
		public String updateLaundary()
		{
			
			  return "updateBooking";
			
		}
		@RequestMapping(value = "/updateBooking")
		public String updateLaundary(Model model,@RequestParam("type") String type,@RequestParam("num") int num)
		{
			model.addAttribute("abc",dao.updateLaundary(type,num));
			  return "updateBooking";
			
		}
		
		@RequestMapping(value = "/deleted")
		public String deleteLaundary()
		{
			return "deleteBooking";
		}
		@RequestMapping(value = "/deletee")
		public String deleteLaundary(Model model,@RequestParam("type") String type)
		{
			model.addAttribute("typedel",dao.deleteLaundary(type));
			return "deleteBooking";
		}
		
		@RequestMapping(value = "/searched")
		public String searchUser()
		{
			return "searchUser";
		}
		
		@RequestMapping(value = "/searchUser")
		public String search(Model model,@RequestParam("user") String username)
		{
			model.addAttribute("abc",dao.searchLaundary(username));
			return "searchUser";
		}
		
	}
  
