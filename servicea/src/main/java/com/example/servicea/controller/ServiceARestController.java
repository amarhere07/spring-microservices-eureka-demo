package com.example.servicea.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ServiceARestController {
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "hello world microservices";
	}
	
}
