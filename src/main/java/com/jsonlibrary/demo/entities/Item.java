package com.jsonlibrary.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String isbn;
	private String title;
	private String description;
	
	protected Item(){}
	

	public Item(String title, String description, String isbn) {
		this.isbn = isbn;
		this.title = title;
		this.description = description;
	}


	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", isbn=" + isbn + ", title=" + title
				+ ", description=" + description + "]";
	}
	
}
