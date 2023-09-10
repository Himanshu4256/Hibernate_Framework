package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMapping {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//Here we Hire 2 employees
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.setEid(1);
		e1.setName("Himanshu");
		e2.setEid(2);
		e2.setName("Vishal");
		
		// and yha ham 2 projects lete hai.
		Project p1 = new Project();
		Project p2 = new Project();
		p1.setPid(33);
		p1.setProjectName("Library Management System");
		p2.setPid(44);
		p2.setProjectName("ChatBot");
		
		
		// aab yha ham Employees & Projects ko List m add krne jaa rahe hai.
		List<Emp> list1 = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();
		//add emp
		list1.add(e1);
		list1.add(e2);
		//add projects
		list2.add(p1);
		list2.add(p2);
		
		//e1 ko 2 project assign kiye hai
		e1.setProjects(list2);
		
		//p2 project ko 2 emps assign kiye hai.
		p2.setEmps(list1);
				
		
		
		Session s = factory.openSession(); //en data ko save and commit krne k liye 
		Transaction tx = s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);  
		tx.commit();
		s.close();
		factory.close();
	}

}
