package com.JenelleHanson.theCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    @GetMapping("/")
	public String getHomePage() {
		// Either the password variable does not exist and we create it and set to "bushido" here
		return "index.jsp"; //GET method must return a page to display
	}
    
    @RequestMapping(value="/submit", method=RequestMethod.POST)
    public String checkPassword(@ModelAttribute("errors") String errors, @RequestParam("submit") String submit) {
    	//if the session we created is matched to the password then it should redirect to the code page if not
        if(submit.equals("bushido")) {
        	System.out.println("Correct code");
        	return "index1.jsp";
        } else {//then it will redirect to the previous page
            System.out.println(errors);
            return "redirect:/errors";
        }
    }
    
    @RequestMapping("/errors")
    public String errors(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("errors", "A test errror!");
        return "redirect:/";
    }

}
