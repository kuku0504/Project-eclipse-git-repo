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
	
	@GetMapping("/add")
	public int addition(int x, int y) {
		return x+y;
	}
	
	@GetMapping("/sub")
	public int subtraction(int x, int y) {
		System.out.println("sub()");
		int c=x-y;
		return c;
	}
}
