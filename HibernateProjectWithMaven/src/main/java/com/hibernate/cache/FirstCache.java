package com.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

// Successfully working
public class FirstCache {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		// It is enabled by default ||| ye data ko chache [session] mai save krta hai 
		
		Student st = session.load(Student.class, 112); // yha ese query fire ki hai. obj ko Db se create kiya hai
		System.out.println(st);
		
		System.out.println("Working something..");
		
		
		// Aab hme yahi same obj dubara chahiye to session se hi call kra lenge ese ye db se obj ni create krega.
		Student st1 = session.load(Student.class, 112);
		System.out.println(st1);
		
		
		System.out.println(session.contains(st)); // it checks ki kya koi obj save hai session mai
		
		session.close();
		
	}

}
