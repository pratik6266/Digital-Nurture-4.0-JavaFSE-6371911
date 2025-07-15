package com.cognizant.spring_learn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Public {
	@GetMapping()
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<String>("Hello, World!",HttpStatus.OK);
	}
}
