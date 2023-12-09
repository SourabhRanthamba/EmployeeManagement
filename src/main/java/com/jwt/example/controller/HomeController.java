package com.jwt.example.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.model.User;
import com.jwt.example.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService userSrvice;
	@GetMapping("/user")
	public List<User> getUser() {
		System.out.println("getting users");
		return this.userSrvice.getUser();
	}
	@GetMapping("/current-user")
	public String getLoogedInUser(Principal principal) {
		return principal.getName(); 
	}
}
