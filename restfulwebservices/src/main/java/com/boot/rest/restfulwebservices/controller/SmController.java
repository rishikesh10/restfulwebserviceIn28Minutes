package com.boot.rest.restfulwebservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmController {
	
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String getHelloWorld() {
		return "Hello World!";
	}

}
