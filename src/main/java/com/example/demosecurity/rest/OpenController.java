package com.example.demosecurity.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OpenController {
	
	@GetMapping(value="/open")
	public String getOpen() {
		return "OPEN";
	}
	

}
