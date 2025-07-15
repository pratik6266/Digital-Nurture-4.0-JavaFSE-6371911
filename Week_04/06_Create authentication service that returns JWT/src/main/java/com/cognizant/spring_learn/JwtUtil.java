package com.cognizant.spring_learn;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

	private final Key secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);

	public String generateToken(String username) {
		return Jwts.builder()
						.setSubject(username)
						.setIssuer("SpringApp")
						.setIssuedAt(new Date())
						.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour
						.signWith(secretKey)
						.compact();
	}
}
