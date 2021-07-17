package com.JenelleHanson.Languages2.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.JenelleHanson.Languages2.models.Language;
import com.JenelleHanson.Languages2.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService lService;
	
	public LanguageController (LanguageService service) {
		this.lService = service;
	}
	
	
	//@Request Mapping
	//model attribute should match the index page
	@GetMapping("/")
	public String index(Model model, @ModelAttribute("language") Language language) {
		model.addAttribute("allLanguages", this.lService.allLanguages());
		return "index.jsp";
	}
	
	@PostMapping("/")//takes information from the frontend to give to the backend
	public String addLang(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allLanguages", this.lService.allLanguages());
			return "index.jsp";
		}
		this.lService.createLanguage(language);
		return "redirect:/";
	}
	
	@GetMapping("/show/{id}")
	public String showLang(Model model, @PathVariable("id") Long id) {
		model.addAttribute("thisLang", this.lService.findLanguage(id));
		return "show.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editLang(Model model, @PathVariable("id") Long id) {
		model.addAttribute("language", this.lService.findLanguage(id));
		return "edit.jsp";
	}
	
	//put must have an input hidden method on the edit jsp page and the hidden method true in the app/properties page
	@PutMapping("/edit/{id}") //can use a post mapping looks similar to earlier one
	public String editLang(@Valid @ModelAttribute("language") Language lang, BindingResult result, Model model, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			model.addAttribute("language", this.lService.findLanguage(id));
			return "edit.jsp";
		}
		this.lService.updateLanguage(lang);
		return "redirect:/show/{id}";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteLang(@PathVariable("id") Long id) {
		this.lService.deleteLanguage(id);
		return "redirect:/";
	}
	
}