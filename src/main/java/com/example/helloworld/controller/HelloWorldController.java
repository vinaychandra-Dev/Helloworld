package com.example.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.dto.Employee;
import com.example.helloworld.service.HelloWorldService;

@RestController
public class HelloWorldController {
	
	
	@Autowired
	HelloWorldService helloWorldService;
	
	@GetMapping("/test")
	public String getResponse() {
		return "Hello world....";
	}
	
	@PostMapping("/save")
	public Employee getResponse(@RequestBody Employee employee) {
		Employee e= helloWorldService.save(employee);
		return e;
	}

}
