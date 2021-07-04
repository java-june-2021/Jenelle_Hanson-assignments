package com.JenelleHanson.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
	
	// All functions with the same parameter in the "@---MAPPING" will happen when you land on that page immediately.
	// Therefore, the "getHomePage" function and the "doCounting" function, happen when we land on page "/".
	// We could of course put a button in the HTML pages to do functions, in this case, the "action" we care about
	// is NOT a button push, but a landing on a page.
	
	// This requires a GET mapping and doesn't need a POST mapping, because events such as "site visits" 
	// are automatically tracked in the code. It doesn't require anything extra from the user, which would make it a
	// POST. The user sends us nothing. Therefore, we can do this in the GET mapping.
	@GetMapping("/")
	public String getHomePage(HttpSession session) {
		// Either the count variable does not exist and we create it and set to 0 here OR
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			// The count variable exists and thus we increment it here
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
			System.out.println(currentCount);
		}
		return "index.jsp"; //GET method must return a page to display
	}
	
	// The counter page is required to be a separate page that shows the # of times the home page was visited.
	// It is a GET mapping because we don't send anything to the system from the user.
	@GetMapping("/counter")
	public String getTotalCount(HttpSession session) {
		Integer currentCount = (Integer) session.getAttribute("count");
		System.out.println(currentCount);
		return "index1.jsp";
	}
	
	// This must be a POST mapping, because the user must PUSH the reset button, thus they are sending
	// us info about what they want, which is a POST action.
	// model allows us to post to the page
	@PostMapping("/reset")
	public String resetCounting(HttpSession session, Model model) {
		int currentCount = 0;
		session.setAttribute("count", currentCount);
		model.addAttribute("count", currentCount);
		return "redirect:/counter";
	}
}