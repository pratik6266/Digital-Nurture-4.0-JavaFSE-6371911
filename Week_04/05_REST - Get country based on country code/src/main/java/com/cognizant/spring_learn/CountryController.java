package com.cognizant.spring_learn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping("/{countryCode}")
	public ResponseEntity<Country> getCountry(@PathVariable String countryCode) {
		Country country = countryService.getCountry(countryCode);
		return ResponseEntity.ok(country);
	}

}
