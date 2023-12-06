package com.security.userdetailservice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsServiceRestController {

	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcomr Page";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	
	
}
