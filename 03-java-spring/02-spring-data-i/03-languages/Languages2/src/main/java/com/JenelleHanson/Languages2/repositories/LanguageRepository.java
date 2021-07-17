package com.JenelleHanson.Languages2.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.JenelleHanson.Languages2.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language,Long> {
	List<Language> findAll(); //Select * from languages	
}
