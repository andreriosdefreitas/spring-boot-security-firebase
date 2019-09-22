package com.example.demosecurity.config.firebase;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class FirebaseAuthenticationToken extends UsernamePasswordAuthenticationToken {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6983392118449390227L;
	
	private final String token;

	public FirebaseAuthenticationToken(final String token) {
		super(null, null);
		this.token = token;
	}

	public String getToken() {
		return token;
	}

}
