package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	@Column(name="project_Name")
	private String projectName;
	
	@ManyToMany(mappedBy = "projects")
	private List<Emp> emps; //Project having many employees

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	

}

//Working - Project k ander jo "emps" wali field hai ye ek table bna dega. BUT (mappedBy = "projects") mapping ki capicity projects wale field ko hi de dega jisse es package mai 1 member hi eski mapping krega.
