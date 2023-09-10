package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tut.Student;

public class CriteriaAPI {
public static void main(String[] args) {
	Session session = new Configuration().configure().buildSessionFactory().openSession();
	Criteria c = session.createCriteria(Student.class);
	
//	c.add(Restrictions.eq("certi.course", "Android"));
	c.add(Restrictions.gt("id", 24));
	
	List<Student> st = c.list();
	
	for (Student student : st) {
		System.out.println(student);
	}
	
	
	session.close();
}
}
