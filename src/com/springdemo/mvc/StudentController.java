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
@RequestMapping("/student")
public class StudentController {
	
	@InitBinder
	private void InitBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor editor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, editor);
	}


	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student student = new Student();
		model.addAttribute("student",student);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "student-form";
		} else {

			return "student-confirmation";
		}
	}
}
