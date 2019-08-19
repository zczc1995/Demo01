package com.example.demo.controller;



import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.HelloService;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	@Autowired
	DemoService demoService;
	
	@Autowired
	HelloService helloService;
	
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return demoService.sayHello(name);
	}
	
	@GetMapping("/hello2/{name}")
	public String hello2(@PathVariable String name) {

		return helloService.sayhello(name);
	}

}
