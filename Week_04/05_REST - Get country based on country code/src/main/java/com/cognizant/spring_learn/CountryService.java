package com.cognizant.spring_learn;

import org.springframework.stereotype.Component;

@Component
public class CountryService {
	public Country getCountry(String countryCode) {
		if ("US".equalsIgnoreCase(countryCode)) {
			return new Country("US", "United States");
		}
		else if ("IN".equalsIgnoreCase(countryCode)) {
			return new Country("IN", "India");
		}
		else if ("JP".equalsIgnoreCase(countryCode)) {
			return new Country("JP", "Japan");
		}
		else if ("GE".equalsIgnoreCase(countryCode)) {
			return new Country("GE", "Germany");
		}
		return null;
	}
}
