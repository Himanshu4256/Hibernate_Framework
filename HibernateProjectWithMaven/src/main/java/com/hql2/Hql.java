package com.hql2;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class Hql {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		
		String query = "from Student as s where s.city=:x and s.name=:n";
		Query q= s.createQuery(query);
		
		q.setParameter("x", "Washington");
		q.setParameter("n", "Himanshu Sharma");
		
		List<Student> list = q.list();
		
		for (Student student : list) {
			System.out.println(student.getName()+ " : "+student.getCerti().getCourse());
		}
		
		s.close();
		 
	}

}
