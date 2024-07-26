package com.azure.demo4.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoPracApplication {

	@GetMapping("/search")
	public String search(){
		return "this is main class $ deployed to azure successfully!!";

	}


	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoPracApplication.class, args);
	}

}
