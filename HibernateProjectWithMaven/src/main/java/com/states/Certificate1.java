package com.states;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate1 {
	
	
	private String course;
	private String duration;
	
	
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
	
	public Certificate1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate1(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	
	
	
}    
