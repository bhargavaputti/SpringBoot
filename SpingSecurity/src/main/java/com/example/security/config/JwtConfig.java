package com.example.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.security.token.JwtUtil;

@Configuration
public class JwtConfig {

	@Bean
	JwtUtil jwtUtil() {
		return new JwtUtil();
	}
}
