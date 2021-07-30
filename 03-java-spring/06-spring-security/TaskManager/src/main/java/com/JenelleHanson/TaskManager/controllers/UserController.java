package com.JenelleHanson.TaskManager.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.JenelleHanson.TaskManager.models.User;
import com.JenelleHanson.TaskManager.services.UserService;
import com.JenelleHanson.TaskManager.validators.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService uService;
	@Autowired
	private UserValidator validator;
	
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user) {
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		validator.validate(user, result);
		if(result.hasErrors()) {
			return "index.jsp";
		}
		User newUser = this.uService.registerUser(user);
		session.setAttribute("user__id", newUser.getId());
		return "redirect:/ideas";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("lemail") String email, @RequestParam("lpassword") String password, RedirectAttributes redirectAttr, HttpSession session) {
		if(!this.uService.authenticateUser(email, password)) {
			redirectAttr.addFlashAttribute("loginError", "Invalid Credentials");
			return "redirect:/";
		}
		
		User user = this.uService.getByEmail(email);
		session.setAttribute("user__id", user.getId());
		return "redirect:/tasks";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
