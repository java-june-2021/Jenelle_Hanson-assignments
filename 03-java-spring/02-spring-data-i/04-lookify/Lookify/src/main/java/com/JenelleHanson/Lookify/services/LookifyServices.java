package com.JenelleHanson.Lookify.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JenelleHanson.Lookify.models.Lookify;
import com.JenelleHanson.Lookify.repositories.LookifyRepository;

@Service
public class LookifyServices {
	@Autowired
	private  final LookifyRepository lRepo;
	//create a constructor to define repository
	public LookifyServices(LookifyRepository lRepo) {
        this.lRepo = lRepo;
    }
	
	public List<Lookify> allSongs() {
	    return this.lRepo.findAll();
	}
	
	public List<Lookify> findTop10() {
		return this.lRepo.findTop10ByOrderByRatingDesc();
	}
	
	//List<Lookify> findByArtistContaining(String search);
	public List<Lookify> findByArtist(String artist) {
		return this.lRepo.findByArtistContaining(artist);
	}
	
	//single song retrieval AKA Read
    public Lookify findSong(Long id) {
    	return this.lRepo.findById(id).orElse(null);
    }
    
    //Create
    public Lookify createSong(Lookify song) {
    	return this.lRepo.save(song);
    }
    
    
    //Update
    public Lookify updateSong(Lookify updateSong) {
    	return this.lRepo.save(updateSong);
    }
    
    //Delete
    public void deleteSong(Long id) {
    	this.lRepo.deleteById(id);
    }
    
}
