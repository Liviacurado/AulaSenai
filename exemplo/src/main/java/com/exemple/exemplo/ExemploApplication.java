package com.exemple.exemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication
@RestController
public class ExemploApplication {
	@Autowired
	@Qualifier ("aplicationName")
	private String aplicationName;
	
	

	 @GetMapping("/")
	 public String saudacao() {
	 	return aplicationName;
	 }
	 

	public static void main(String[] args) {
		SpringApplication.run(ExemploApplication.class, args);
	}

}
