package com.ourmarket.ReactAPI.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {

	@GetMapping("/api/data")
	@CrossOrigin(origins = "http://localhost:3000")
	public String test() {
		return "Hello React!";
	}
}