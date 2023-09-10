package com.single.table.hibernate;

import javax.persistence.Entity;

@Entity
public class Child2 extends Parent{
	private String schoolName;
	private int fee;
	private String sectionName;
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	

}
