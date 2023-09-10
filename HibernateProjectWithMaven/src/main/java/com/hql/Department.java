package com.hql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {
 @Id
 @GeneratedValue
	int deptid;
 	String deptname;
 	String name;
 
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
 
}
