package com.example.mypack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsFinalApplication.class, args);
	}
	
	@GetMapping(path = "/welcome")
	public String getMessage() {
		return "First CI/CD with github actions";
	}

}
