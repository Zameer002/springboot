package com.abc.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

	@GetMapping("/students")
	public String helloMessage() {
		return "Hey welcome to Spring REST API";
	}
	
	
}
