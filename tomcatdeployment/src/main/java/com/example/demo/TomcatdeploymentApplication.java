package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TomcatdeploymentApplication {

	@GetMapping("/test")
	public String test()
	{
		return "application deployed";
	}
	public static void main(String[] args) {
		SpringApplication.run(TomcatdeploymentApplication.class, args);
	}

}
