package com.example.apisalinas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ExampleController {
 
	@GetMapping
	public String getHelloWorld() {
		
		return "Hola mundo";
	}
}
