package com.JenelleHanson.dojoSurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")//links upon entry to the first page
	public String getSurveyPage() {
		return "index.jsp";
	}
	
	@GetMapping("/success")//links upon entry to the first page
	public String showResult(HttpSession session , Model model) {// use to connect to the table or p tag series
		String name = (String) session.getAttribute("name");
		String location = (String)session.getAttribute("location");
		String language = (String)session.getAttribute("language");
		String comment = (String)session.getAttribute("comment");
		model.addAttribute("name", name);//refer to dojo survey
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		return "index1.jsp";
	}
	
	@GetMapping("/javaBonus")//links upon entry to the first page
	public String bonus() {
		return "index2.jsp";
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String formSubmission(@RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comment") String comment, HttpSession session) {	
		if(language.equals("java")) {
            return "redirect:/javaBonus";
		} else {
			session.setAttribute("name", name);
			session.setAttribute("location", location);
			session.setAttribute("language", language);
			session.setAttribute("comment", comment);
			System.out.println(name);
			System.out.println(location);
			System.out.println(language);
			System.out.println(comment);
        	return "redirect:/success";
		}
	}
}
