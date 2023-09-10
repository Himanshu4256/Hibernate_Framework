package com.states;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;



//@Entity(name="student_details")   => esse class ka name bhi change hojaega ye class, Table Both ko chnge kregi.
//@Table(name="mystudents")   => sirf Table ka name change krega.

@Entity
public class Student1 {
	
	@Id
	private int id;

	private String name;
	private String city;
	
	private Certificate1 certi;
	
	
//	public Student(int id, String name, String city) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.city = city;
//	}
	
	
	public Student1() {
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
	
	
	
	
	// Certificate1 class setter getter
	public Certificate1 getCerti() {
		return certi;
	}
	public void setCerti(Certificate1 certi) {
		this.certi = certi;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
