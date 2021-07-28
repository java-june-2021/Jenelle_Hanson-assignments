package com.JenelleHanson.GreatIdeas.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="ideas")
public class Idea {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	private String iText;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "likes", 
        joinColumns = @JoinColumn(name = "idea_id"), 
        inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> usersWhoLiked;

	public Idea() {	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getiText() {
		return iText;
	}

	public void setiText(String iText) {
		this.iText = iText;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsersWhoLiked() {
		return usersWhoLiked;
	}

	public void setUsersWhoLiked(List<User> usersWhoLiked) {
		this.usersWhoLiked = usersWhoLiked;
	}
	
	
	
}

