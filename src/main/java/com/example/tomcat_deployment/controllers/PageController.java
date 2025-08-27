package com.example.tomcat_deployment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	@GetMapping("/home")
	public String homePageAgain() {
		return "home";
	}
	
	
	@GetMapping("/about")
	public String aboutPage() {
		return "about";
	}

}
