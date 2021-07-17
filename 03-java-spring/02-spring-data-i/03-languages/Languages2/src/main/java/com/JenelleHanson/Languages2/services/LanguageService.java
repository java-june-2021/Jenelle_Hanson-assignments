package com.JenelleHanson.Languages2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JenelleHanson.Languages2.models.Language;
import com.JenelleHanson.Languages2.repositories.LanguageRepository;

@Service
public class LanguageService {
	//Connect to repository
		@Autowired
		private  final LanguageRepository lRepo;
		//create a constructor to define repository
		public LanguageService(LanguageRepository lRepo) {
	        this.lRepo = lRepo;
	    }
		
		// returns all the languages
	    public List<Language> allLanguages() {
	        return this.lRepo.findAll();
	    }
	    
	    //single lang retrieval AKA Read
	    public Language findLanguage(Long id) {
	    	return this.lRepo.findById(id).orElse(null);
	    }
	    
	    //Create
	    public Language createLanguage(Language lang) {
	    	return this.lRepo.save(lang);
	    }
	    
	    
	    //Update
	    public Language updateLanguage(Language updateLang) {
	    	return this.lRepo.save(updateLang);
	    }
	    
	    //Delete
	    public void deleteLanguage(Long id) {
	    	this.lRepo.deleteById(id);
	    }
}

