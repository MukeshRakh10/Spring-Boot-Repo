package com.mk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
	@GetMapping("/message")
	public ResponseEntity<String> getMessage() {
		String str = "<h1><b>Welcome To Spring Boot</b></h1>";
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
}
