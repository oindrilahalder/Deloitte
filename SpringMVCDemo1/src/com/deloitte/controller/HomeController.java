package com.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/ahmed")
public String gg() {
		return "ghosia";
	
}
	@RequestMapping("/customer")
	public String pp() {
			return "cust";
		
	}
	@RequestMapping("/product")
	public String cc() {
			return "product";
		
	}
	@RequestMapping("/employee")
	public String ee() {
			return "employee";
		
	}
	
	@RequestMapping("/guest")
	public String aa() {
			return "guest";
		
	}
}
