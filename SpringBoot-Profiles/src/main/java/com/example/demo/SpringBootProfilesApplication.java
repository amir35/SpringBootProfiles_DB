package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProfilesApplication {
	
	@Value("${app.message}")
	static String message;

	public static void main(String[] args) {
		
		
		
		SpringApplication.run(SpringBootProfilesApplication.class, args);
		
		//System.out.println("Message : " +message);
	}

}
