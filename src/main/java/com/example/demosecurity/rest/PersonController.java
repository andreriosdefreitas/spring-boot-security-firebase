package com.example.demosecurity.rest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demosecurity.config.firebase.FirebaseUserDetails;

@RestController
@RequestMapping("/auth/api")
public class PersonController {
	
	@GetMapping(value="/person")
	public String getPersonName() {
		
		return ((FirebaseUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
	}

}
