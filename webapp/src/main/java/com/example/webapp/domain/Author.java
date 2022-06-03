package com.example.webapp.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Author {

	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long author_id;	

private String first_name;
private String last_name;
@ManyToMany
@JoinTable(name="book_author", joinColumns= @JoinColumn(name="author_id"),inverseJoinColumns=
@JoinColumn(name="book_id"))
private Set<Book> books;





public Long getAuthor_id() {
	return author_id;
}
public void setAuthor_id(Long author_id) {
	this.author_id = author_id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public Set<Book> getBooks() {
	return books;
}
public void setBooks(Set<Book> books) {
	this.books = books;
}


}
