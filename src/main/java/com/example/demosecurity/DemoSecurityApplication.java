package com.example.demosecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.demosecurity.config.ApplicationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
public class DemoSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSecurityApplication.class, args);
	}

}

