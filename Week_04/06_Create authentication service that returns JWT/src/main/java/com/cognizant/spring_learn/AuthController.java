package com.cognizant.spring_learn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

	@Autowired
	private JwtUtil jwtUtil;

	@PostMapping("/authenticate")
	public ResponseEntity<String> generateToken(@RequestBody AuthRequest authRequest) {
		if ("user".equals(authRequest.getUsername()) && "password".equals(authRequest.getPassword())) {
			String token = jwtUtil.generateToken(authRequest.getUsername());
			return ResponseEntity.ok(token);
		} else {
			return ResponseEntity.status(401).body("Invalid credentials");
		}
	}
}
