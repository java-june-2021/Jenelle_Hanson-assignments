package com.JenelleHanson.codingcontroller.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class HomeController {
	@RequestMapping(value = "", method=RequestMethod.GET)
	public String coding() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping(value = "/python", method=RequestMethod.GET)
	public String python() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping(value = "/java", method=RequestMethod.GET)
	public String java() {
		return "Java/Spring is better!";
	}
}
