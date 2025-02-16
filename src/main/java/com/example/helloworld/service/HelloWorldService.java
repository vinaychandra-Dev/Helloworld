package com.example.helloworld.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.helloworld.dto.Employee;

@Component
public class HelloWorldService {
	
	
	
	public Employee save(Employee e) {
		e.setName(e.getName()+" xyz");
		return e;
	}

}
