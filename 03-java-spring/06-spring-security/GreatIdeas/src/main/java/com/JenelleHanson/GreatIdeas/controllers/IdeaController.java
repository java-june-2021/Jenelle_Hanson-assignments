package com.JenelleHanson.GreatIdeas.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.JenelleHanson.GreatIdeas.models.Idea;
import com.JenelleHanson.GreatIdeas.services.IdeaService;
import com.JenelleHanson.GreatIdeas.services.UserService;

@Controller
@RequestMapping("/ideas")
public class IdeaController {
	@Autowired
	private IdeaService iService;
	@Autowired
	private UserService uService;
	
	@GetMapping("")
	private String index(Model model, @ModelAttribute("idea") Idea idea, HttpSession session) {
		model.addAttribute("user", this.uService.findOneUser((Long)session.getAttribute("user__id")));
		model.addAttribute("allIdeas", this.iService.allIdeas());
		return "dashboard.jsp";
	}
	
	@GetMapping("/new")
	public String newPage(Model model, @ModelAttribute("idea") Idea idea) {
		model.addAttribute("allIdeas", this.iService.allIdeas());
		return "new.jsp";
	}
	
	@PostMapping("/new")
	private String NewIdea(@Valid @ModelAttribute("idea") Idea idea, BindingResult result, Model model, HttpSession session) {
		if(result.hasErrors()) {
			model.addAttribute("user", this.uService.findOneUser((Long)session.getAttribute("user__id")));
			model.addAttribute("allIdeas", this.iService.allIdeas());
			return "new.jsp";
		}
		this.iService.createIdea(idea);
		return "redirect:/ideas";
	}
	
	@GetMapping("/{id}")
	public String show(@PathVariable("id") Long id, Model model, HttpSession session) {
		model.addAttribute("thisIdea", this.iService.getOneIdea(id));
		model.addAttribute("user", this.uService.findOneUser((Long)session.getAttribute("user__id")));
		return "idea.jsp";
	}
	
	@GetMapping("/{id}/edit")
	public String editIdea(Model model, @PathVariable("id") Long id) {
		model.addAttribute("thisIdea", this.iService.getOneIdea(id));
		return "edit.jsp";
	}
	
	//put must have an input hidden method on the edit jsp page and the hidden method true in the app/properties page
	@PutMapping("/{id}/edit") //can use a post mapping looks similar to earlier one
	public String editIdea(@Valid @ModelAttribute("idea") Idea idea, BindingResult result, Model model, @PathVariable("id") Long id, HttpSession session) {
		if(result.hasErrors()) {
			model.addAttribute("user", this.uService.findOneUser((Long)session.getAttribute("user__id")));
			model.addAttribute("thisIdea", this.iService.getOneIdea(id));
			return "edit.jsp";
		}
		this.iService.updateIdea(idea);
		return "redirect:/ideas/{id}";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteIdea(@PathVariable("id") Long id) {
		this.iService.deleteIdea(id);
		return "redirect:/ideas";
	}
}
