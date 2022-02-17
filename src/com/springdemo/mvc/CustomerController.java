package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Customer customer = new Customer();

		model.addAttribute("customer",customer);
		
		return "customer-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("customer") Customer customer) {
		
		System.out.println("The Student:"+customer.getFirstName()+" "+customer.getLastName());
		
		return "customer-confirmation";
	}
}