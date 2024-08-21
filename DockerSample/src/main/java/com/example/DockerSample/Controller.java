package com.example.DockerSample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/greet")
	public String greeting() {
		return "Hello, I am deployed";
	}
}
