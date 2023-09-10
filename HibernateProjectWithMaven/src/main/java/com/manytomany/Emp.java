package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int eid;
	private String name;
	
	@ManyToMany
	//@JoinTable(name="emp_project") -> ye jo 3rd Table banti ya bni hai(Emp_Project) uska name change kr dega.
	
	private List<Project> projects;  //employee having many projects.

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	

}


// Working - Emp k ander jo "projects" wali field hai ye ek table bna dega