package com.collectionsmapping;

import java.util.Arrays;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "empModel")
public class EmployeeModel {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITYs)
//	private int id;
//	private String name;
//	private String email;
//	
//	
//	@ElementCollection
//	@CollectionTable(name = "emp_ph")
//	private Set<String> ph;
//
//
//	public int getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public String getEmail() {
//		return email;
//	}
//
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//
//	public Set<String> getPh() {
//		return ph;
//	}
//
//
//	public void setPh(Set<String> ph) {
//		this.ph = ph;
//	}
//
//
//	public EmployeeModel(String name, String email, Set<String> ph) {
//		super();
//		this.name = name;
//		this.email = email;
//		this.ph = ph;
//	}
//
//
//	@Override
//	public String toString() {
//		return "EmployeeModel [id=" + id + ", name=" + name + ", email=" + email + ", ph=" + ph + ", getId()=" + getId()
//				+ ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getPh()=" + getPh() + ", getClass()="
//				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastname;
	
	public EmployeeModel() {}
	
	@ElementCollection
	@OrderColumn(name = "vw")
	private String[] qualification;

	@Override
	public String toString() {
		return "EmployeeModel [id=" + id + ", firstName=" + firstName + ", SecondName=" + lastname
				+ ", qualification=" + Arrays.toString(qualification) + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String[] getQualification() {
		return qualification;
	}

	public void setQualification(String[] qualification) {
		this.qualification = qualification;
	}
	
	
}
