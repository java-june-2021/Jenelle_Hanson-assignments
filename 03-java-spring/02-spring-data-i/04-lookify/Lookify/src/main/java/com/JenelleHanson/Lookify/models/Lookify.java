package com.JenelleHanson.Lookify.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name="lookify")
public class Lookify {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	//title min 5,artist min 5, rating btw 1 & 10
	@Size(min=5, message= "Title name must be at least 5 characters")
	private String title;
	
	@Size(min=5, message= "Artist name must be at least 5 characters")
	private String artist;
	
	@Min(value = 1, message = "Rating must be at least 1")
    @Max(value = 10, message = "Rating must be at most 10")
	private int rating;

	public Lookify() {
	}

	public Lookify(String title, String artist, int rating) {
		this.title = title;
		this.artist = artist;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
