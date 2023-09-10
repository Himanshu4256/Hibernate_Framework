package com.tut;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
//import javax.persistence.Table;



//@Entity(name="student_details")   => esse class ka name bhi change hojaega ye class, Table Both ko chnge kregi.
//@Table(name="mystudents")   => sirf Table ka name change krega.

@Entity
@Cacheable //for use second level cache
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY) //for use second level cache jab sirf read krna ho
public class Student {
	
	@Id
	private int id;

	private String name;
	private String city;
	
	
	//Embedding Annotations
	private Certificate certi;
	
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	// Certificate class setter getter
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", certi=" + certi + "]";
	}

}
