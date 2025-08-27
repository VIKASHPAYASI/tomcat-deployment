package com.example.tomcat_deployment.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public List<String> getUser() {
		return List.of("Vikash","Ajay","Vinod");
		
	}

}
