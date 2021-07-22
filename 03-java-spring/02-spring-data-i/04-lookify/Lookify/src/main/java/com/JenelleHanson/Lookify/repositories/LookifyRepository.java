package com.JenelleHanson.Lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.JenelleHanson.Lookify.models.Lookify;

@Repository
public interface LookifyRepository extends CrudRepository<Lookify, Long> {
	List<Lookify> findAll(); //Select * from lookify
	List<Lookify> findTop10ByOrderByRatingDesc();	
	List<Lookify> findByArtistContaining(String artist);
	//to use findBy you need to match the field name that shows up in the model (minus capitalization)
}
