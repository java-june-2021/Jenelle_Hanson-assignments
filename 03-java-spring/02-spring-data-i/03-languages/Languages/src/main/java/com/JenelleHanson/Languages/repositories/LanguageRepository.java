package com.JenelleHanson.Languages.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.JenelleHanson.Languages.models.LanguageModels;

@Repository
public interface LanguageRepository extends CrudRepository<LanguageModels, Long> {
	//this method retrieves all the languages from the database
	List<LanguageModels> findAll(); //Select * FROM languages in mySQL
}
