package com.registro.login.auth;

import com.registro.login.User.Role;
import com.registro.login.User.User;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

	public AuthResponse login(LoginRequest request) {
		return null;
	}

	public AuthResponse register(RegisterRequest request) {
		User user = User.builder()
				.username(request.getUsername())
				.password(request.getPassword())
				.nombre(request.getNombre())
				.role(Role.USER)
				.build();	
	}

}
