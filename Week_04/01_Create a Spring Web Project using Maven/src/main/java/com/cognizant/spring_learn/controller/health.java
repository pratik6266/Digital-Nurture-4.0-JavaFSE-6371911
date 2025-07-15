package com.cognizant.spring_learn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class health {

	@GetMapping("/health")
	public ResponseEntity<?> healthCheck(){
		return new ResponseEntity<String>("Up & Running", HttpStatus.OK);
	}
}
