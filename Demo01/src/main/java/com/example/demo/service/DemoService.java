package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	public String sayHello(String name) {
		return "hello"+name;
	}

}
