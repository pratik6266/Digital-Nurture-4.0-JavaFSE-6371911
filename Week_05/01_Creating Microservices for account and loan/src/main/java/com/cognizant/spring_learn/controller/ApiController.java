package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.account;
import com.cognizant.spring_learn.model.loan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping
public class ApiController {

	@GetMapping ("/accounts/{number}")
	public ResponseEntity<?> getAccount(@PathVariable String accNumber){
		account acc = new account(accNumber, "savings", 234343);
		return new ResponseEntity<>(acc, HttpStatus.OK);
	}

	@GetMapping("/loans/{number}")
	public ResponseEntity<?> getLoan(@PathVariable String accNumber) {
		loan loan1 = new loan(accNumber, "car", 400000, 3258, 18);
		return new ResponseEntity<>(loan1, HttpStatus.OK);
	}

}
