package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

	
	@GetMapping("/")
	public ResponseEntity<String> firstCall(){
		return new ResponseEntity<String>("<H1>THis the welcome page</h1>",HttpStatus.OK);
	}
	
	
}
