package com.JenelleHanson.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	@RequestMapping("")
	public String index(Model model) {
			String name = "Human";
			model.addAttribute("name", name);
		return "index2.jsp";
	}
	
	@RequestMapping("/{input}")
	public String index1(@PathVariable("input") String name, Model model) {
		model.addAttribute("name", name);
		return "index2.jsp";
	}
	
	@RequestMapping("/{input}/{input1}")
	public String index2(@PathVariable("input") String name, @PathVariable("input1") String last, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("last", last);
		return "index2.jsp";
	}
}
