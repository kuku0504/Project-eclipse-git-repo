package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {
     
	@GetMapping("/show")
	public String home() {
		System.out.println("hello");
		return "welcome";
	}
}
