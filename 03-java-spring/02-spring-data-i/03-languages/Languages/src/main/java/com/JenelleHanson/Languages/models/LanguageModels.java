package com.JenelleHanson.Languages.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="languages")
public class LanguageModels {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	    
		@Column
	    @Size(min = 5, max = 20)
		private String name;
	    
		@Column
	    @Size(min = 5, max = 20)
	    private String creator;
	   	
		@Column(nullable = false)
	    private String version;
		//use @NotNull if using float
//		
//		@Column(updatable=false)
//	    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
//	    private Date createdAt;
//		
//	    @Column
//	    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
//	    private Date updatedAt;
	    
	    public LanguageModels() {
	    }
	    
	    public LanguageModels(String name,
	    		String creator,
	    		String version) {
			this.name = name;
			this.creator = creator;
			this.version = version;
		}
//	    
//	    @PrePersist
//	    protected void onCreate(){
//	        this.createdAt = new Date();
//	    }
//	    
//		@PreUpdate
//	    protected void onUpdate(){
//	        this.updatedAt = new Date();
//		}
	    
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreator() {
			return creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

//		public Date getCreatedAt() {
//			return createdAt;
//		}
//
//		public void setCreatedAt(Date createdAt) {
//			this.createdAt = createdAt;
//		}
//
//		public Date getUpdatedAt() {
//			return updatedAt;
//		}
//
//		public void setUpdatedAt(Date updatedAt) {
//			this.updatedAt = updatedAt;
//		}
	    
}
