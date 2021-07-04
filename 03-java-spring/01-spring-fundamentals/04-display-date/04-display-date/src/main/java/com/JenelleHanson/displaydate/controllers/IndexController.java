package com.JenelleHanson.displaydate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String index1(Model model) {
		Date date = new java.util.Date();
		model.addAttribute("date", date);
		return "index1.jsp";
	}
	
	@RequestMapping("/time")
	public String index2(Model model) {
		Date time = new java.util.Date();
		model.addAttribute("time", time);
		return "index2.jsp";
	}
}