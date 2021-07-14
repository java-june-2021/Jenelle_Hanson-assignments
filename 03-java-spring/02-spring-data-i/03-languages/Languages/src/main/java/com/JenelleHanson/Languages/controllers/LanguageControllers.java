package com.JenelleHanson.Languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.JenelleHanson.Languages.models.LanguageModels;
import com.JenelleHanson.Languages.services.LanguageService;

@Controller
public class LanguageControllers {
//	private final LanguageService languageService;
//	public LanguageControllers(LanguageService languageService) {
//		this.languageService = languageService;
//	} THIS IS THE SAME THING AS LINE 25 AND 26 BELOW********
	@Autowired
	private LanguageService lService;
	
	//This maps to the jsp page
	@GetMapping("/")
	public String index(Model model, @ModelAttribute("languages") LanguageModels lang) {
	    model.addAttribute("languages", this.lService.allLanguages());
	    return "index.jsp";
	} 
	
	@GetMapping("/language")
	public List<LanguageModels> allLanguages(){
		return this.lService.allLanguages();
	}
	
	@GetMapping("/language/{id}")
	public LanguageModels getLangById( @PathVariable("id") Long id) {
		return this.lService.getlangById(id);
	}
	
	@DeleteMapping("/language/{id}")
	public void destroyLang(@PathVariable("id") Long id) {
		this.lService.destroyLang(id);
	}
//	  PostMapp
//    public String updatelang(Valid ModelAttribute("languages") LanguageModels lang, BindingResult result, PathVariable("id") Long id) {
//        if (result.hasErrors()) {
//            return "edit.jsp";
//        }else{
//            lService.updatelang(lang);
//            return "redirect:/language";
//        }
//    }
	
	@PostMapping("/language/edit/{id}")
	public LanguageModels createLang(LanguageModels langModel) {
		return this.lService.createLang(langModel);
	}	
}
