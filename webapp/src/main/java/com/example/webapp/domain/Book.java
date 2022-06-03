package com.example.webapp.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	
private Long book_id;
private String name;
private String isbn;
@ManyToMany(mappedBy="books")
private Set<Author> author;



public Long getBook_id() {
	return book_id;
}

public void setBook_id(Long book_id) {
	this.book_id = book_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public Set<Author> getAuthor() {
	return author;
}

public void setAuthor(Set<Author> author) {
	this.author = author;
}
}
