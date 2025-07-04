package com.test.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerfileImageApplication {
	
	@GetMapping("/hi")
	public String sayHello() {
		return "hello world!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerfileImageApplication.class, args);
	}

}
