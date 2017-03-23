package com.example.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.session.form.SessionForm;

@Controller
@SessionAttributes("sessionForm")
public class SessionTestController {

	@RequestMapping(method = RequestMethod.GET, value = "/sessionTest1")
	public String index (SessionForm sessionForm, Model model) {
		//@ModelAttribute("sessionForm")
		sessionForm.setName2("aaaaa");
		model.addAttribute("name2", sessionForm.getName2());
		sessionForm.setName3(sessionForm.getName1() + sessionForm.getName2());
		model.addAttribute("name3", sessionForm.getName3());
		
		return "sessiontest/sessionTest1";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/sessionTest1")
	public String output (SessionForm sessionForm, Model model) {
		//@ModelAttribute("sessionForm") 
		
		sessionForm.setName3(sessionForm.getName1() + sessionForm.getName2());
		model.addAttribute("name3", sessionForm.getName3());
		
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1, "Miura", "kakaka"));
		customers.add(new Customer(2, "Aoyama", "Ayu"));
		customers.add(new Customer(3, "Aoyama", "Yuki"));
		
		model.addAttribute("customers", customers);
		
		return "sessiontest/sessionTest1";
	}
	
	public class Customer {
		
		private int id;
		private String lastName;
		private String firstName;
		
		public Customer (int id, String lastName, String firstName) {
			this.id = id;
			this.lastName = lastName;
			this.firstName = firstName;
		}
		
	}
	
}
