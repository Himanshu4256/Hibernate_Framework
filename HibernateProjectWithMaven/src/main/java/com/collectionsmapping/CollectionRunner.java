package com.collectionsmapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CollectionRunner {
	
	public static void main(String[] args) {
		
		//SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeModel.class).buildSessionFactory();
		//Session session = factory.getCurrentSession();
		
		
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    Session session = factory.openSession();
		
		
		
//		EmployeeModel employee = null;
//		try {
//			Set<String> phoneNumbers = new HashSet<String>();
//			phoneNumbers.add("58637458754");
//			phoneNumbers.add("3584673484");
//			phoneNumbers.add("74153481324");
//			phoneNumbers.add("3214853124583453");
//			
//			// Create EmployeModel Object
//			employee = new EmployeeModel("Vikram", "vikky@gmail.com", phoneNumbers);
//			
//			session.beginTransaction();
//			session.persist(employee);
//			
//			session.getTransaction().commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			session.close();
//			factory.close();
//		}
		
		
		
		Transaction tr = session.getTransaction();
		tr.begin();
		
		EmployeeModel e = new EmployeeModel();
		e.setFirstName("First");
		e.setLastname("lastname");
		e.setQualification(new String[] {"BTech","MTech"});
		session.persist(e);
		tr.commit();
        session.close();
		
	}
}
