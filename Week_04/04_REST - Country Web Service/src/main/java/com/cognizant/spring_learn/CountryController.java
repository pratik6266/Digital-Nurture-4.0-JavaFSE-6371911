package com.cognizant.spring_learn;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {

	@GetMapping
	public ResponseEntity<Country> getCountryIndia() {
		Country country = new Country("IN", "India");
		return ResponseEntity.ok(country);
	}

}
