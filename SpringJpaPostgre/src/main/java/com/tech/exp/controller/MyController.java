package com.tech.exp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping(value="/getdata")
	public String getdata() {
		return "Hello this is my code";
	}
	

}
