package com.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

// cache working
public class SecondCache {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session1 = factory.openSession();
		
		Student st1 = session1.get(Student.class, 112);
		System.out.println(st1);
		session1.close();
		
		Session session2 = factory.openSession();
		Student st2 = session2.get(Student.class, 112);
		System.out.println(st2);
		session2.close();
		
		
	}
}
