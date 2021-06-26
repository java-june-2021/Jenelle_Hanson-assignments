package com.JenelleHanson.codingcontroller.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping(path = "/dojo")
public class DojoController {
	@RequestMapping(path = "", method=RequestMethod.GET)
	public String dojo() {
		return "The dojo is awesome!";
	}
		
	@RequestMapping(path = "/{location}", method=RequestMethod.GET)
	public String burbank(@PathVariable("location") String location) {
		if(location.equals("burbank")) {
			return "Burbank Dojo is located in Southern California";
		} else if (location.equals("san-jose")) {
			return  "SJ dojo is the headquarters";
		} else {
			return location + " not recognized";
		}
	}
}
