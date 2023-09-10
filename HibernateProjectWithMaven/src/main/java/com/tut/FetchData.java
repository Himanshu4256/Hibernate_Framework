package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	public static void main(String[] args) {
		// here we are fetching data through Id.
		
		//get,load
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		//get-student:id = 106
		Student student = (Student)session.load(Student.class, 106);
		System.out.println(student.getName()+" : "+student.getCity());
		
		AddressW_AllNotations ad = (AddressW_AllNotations)session.get(AddressW_AllNotations.class, 2);
		System.out.println(ad.getStreet()+" : "+ad.getCity());
		session.close();
		factory.close();
		
	}

}
