package com.JenelleHanson.Lookify.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.JenelleHanson.Lookify.models.Lookify;
import com.JenelleHanson.Lookify.services.LookifyServices;

@Controller
public class LookifyController {
	private final LookifyServices lService;
	
	public LookifyController (LookifyServices service) {
		this.lService = service;
	}
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	
	@GetMapping("/dashboard")
	public String index(Model model, @ModelAttribute("song") Lookify song) {
		model.addAttribute("allSongs", this.lService.allSongs());
		return "dashboard.jsp";
	}
	
	
	@GetMapping("/songs/{id}")
	public String showSong(Model model, @PathVariable("id") Long id) {
		model.addAttribute("thisSong", this.lService.findSong(id));
		return "show.jsp";
	}
	
	@GetMapping("/songs/new")
	public String addSong(Model model, @ModelAttribute("song") Lookify song) {
		model.addAttribute("thisSong", this.lService.allSongs());
		return "new.jsp";
	}
	
	@PostMapping("/songs/new")//takes information from the frontend to give to the backend
	public String addSong(@Valid @ModelAttribute("song") Lookify song, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allSongs", this.lService.allSongs());
			return "new.jsp";
		}
		this.lService.createSong(song);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/songs/topTen")//in the URL not the file name**
	public String topTen(Model model) {
		model.addAttribute("allSongs", lService.findTop10());
		return "topTen.jsp";//just the 
	}
	
	@GetMapping("/search/artists")
	public String search(@RequestParam("artist") String artist, Model model) {
		model.addAttribute("allSongs", lService.findByArtist(artist));
		model.addAttribute("artist", artist);
		return "search.jsp";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteSong(@PathVariable("id") Long id) {
		this.lService.deleteSong(id);
		return "redirect:/dashboard";
	}
}
