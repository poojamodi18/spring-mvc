package com.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@InitBinder
	private void InitBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor editor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, editor);
	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		Customer customer = new Customer();

		model.addAttribute("customer", customer);

		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "customer-form";
		} else {

			return "customer-confirmation";
		}
	}

}
