package com.tut;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App2_Embedded {
	public static void main(String[] args) {
		System.out.println( "Project Started..." );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Student student1 = new Student();
        student1.setId(64632);
        student1.setName("Ankit Tiwari");
        student1.setCity("Toronto");
        
        Certificate certificate1 = new Certificate();
        certificate1.setCourse("Android");
        certificate1.setDuration("3 Months");
        
        student1.setCerti(certificate1);
        
//-----------------------------------------------------------        
        
        Student student2 = new Student();
        student2.setId(34566);
        student2.setName("Himanshu Sharma");
        student2.setCity("Washington");
        
        Certificate certificate2 = new Certificate();
        certificate2.setCourse("Hibernate");
        certificate2.setDuration("2 Months");
        student2.setCerti(certificate2);
        
        
//-----------------------------------------------------------        
        
        Student student3 = new Student();
        student3.setId(566);
        student3.setName("Dushyant Sharma");
        student3.setCity("Bengaluru");
        
        Certificate certificate3 = new Certificate();
        certificate3.setCourse("Hibernate");
        certificate3.setDuration("2 Months");
        student3.setCerti(certificate3);
        
//-----------------------------------------------------------        
        
        Student student4 = new Student();
        student4.setId(56466);
        student4.setName("Rupal Sharma");
        student4.setCity("Pune");
        
        Certificate certificate4 = new Certificate();
        certificate4.setCourse("Java");
        certificate4.setDuration("6 Months");
        student4.setCerti(certificate4);
        
//-----------------------------------------------------------        
        
        Student student5 = new Student();
        student5.setId(56346);
        student5.setName("Vamika Sharma");
        student5.setCity("Bengaluru");
        
        Certificate certificate5 = new Certificate();
        certificate5.setCourse("Hibernate");
        certificate5.setDuration("2 Months");
        student5.setCerti(certificate5);
        
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        // here we save object through Session
        s.save(student1);
        s.save(student2);
        s.save(student3);
        s.save(student4);
        s.save(student5);
        
       
        tx.commit();
        s.close();
        
        factory.close();
	}

}
