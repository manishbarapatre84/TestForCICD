package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@GetMapping("/")
	public ResponseEntity<String> firstCall(){
		return new ResponseEntity<String>("<H1>THis the USER welcome page</h1>",HttpStatus.OK);
	}
	
	
}
