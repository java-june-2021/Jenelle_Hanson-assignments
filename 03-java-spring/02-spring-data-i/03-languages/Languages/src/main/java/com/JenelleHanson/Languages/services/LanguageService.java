package com.JenelleHanson.Languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JenelleHanson.Languages.models.LanguageModels;
import com.JenelleHanson.Languages.repositories.LanguageRepository;

@Service //annotation for java don't forget to add
public class LanguageService {
	//Connect to repository
	@Autowired
	private LanguageRepository lRepo;
	//create a constructor to define repository
	public LanguageService(LanguageRepository lRepo) {
        this.lRepo = lRepo;
    }
	
	// returns all the languages
    public List<LanguageModels> allLanguages() {
        return this.lRepo.findAll();
    }
	
	//Create
	public LanguageModels createLang(LanguageModels language) {
		return this.lRepo.save(language);
	}
	
	//find one lang
	//Read(adding the CRUD functionality must do all crud all the time) this is an optional either get it or else 
    public LanguageModels getlangById(Long id) {
    	return this.lRepo.findById(id).orElse(null);
    }
    
    //Updates a language
    public LanguageModels updatelang(LanguageModels language) {
    	return this.lRepo.save(language);
    }
    
    //Destroys a language
    public void destroyLang(Long id) {
    	this.lRepo.deleteById(id);
    }
}
