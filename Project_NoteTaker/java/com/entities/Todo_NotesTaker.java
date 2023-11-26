package com.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="notes")
public class Todo_NotesTaker {
	@Id
	private int id;
	private String title;
	private String content;
	private Date addedDate;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getaddedDate() {
		return addedDate;
	}
	public void setaddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	
	
	public Todo_NotesTaker(String title, String content, Date addedDate) {
		super();
	 // this.id = id; :- esse hme khud Id Deni Padegi
		
		this.id = new Random().nextInt(100000); //ye Random Ids Generate krega 0-100000 Tak.
		this.title = title;
		this.content = content;
		this.addedDate = addedDate;
	}
	
	
//	public Todo_NotesTaker() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	
	
	
	
	
	
	

}
