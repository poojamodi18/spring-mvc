package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("processFormCap")
	public String processFormCap(HttpServletRequest request,Model model) {
		
		String name = request.getParameter("studentName");
		
		name = "Hii "+name.toUpperCase();
		
		model.addAttribute("message", name);
		
		return "helloworld";
	}
	
	@RequestMapping("processFormCapTwo")
	public String processFormCapTwo(@RequestParam("studentName") String name,Model model) {
		
		name = "!!!!!! "+name.toUpperCase();
		
		model.addAttribute("message", name);
		
		return "helloworld";
	}
}
