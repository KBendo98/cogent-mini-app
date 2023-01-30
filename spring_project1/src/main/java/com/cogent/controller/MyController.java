package com.cogent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cogent.model.User;

@Controller
public class MyController {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome!";
	}
	
	@GetMapping("/show")
	public User show() {
		
		User user = new User("admin", "password");
		return user;
	}
}
