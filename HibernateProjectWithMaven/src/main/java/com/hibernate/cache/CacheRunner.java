package com.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CacheRunner {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    
	    DataCollector d = new DataCollector();
	    d.setId(2);
	    d.setName("A");
	    d.setCompName("Ducat");
	    System.out.println(d);
	    
	    Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(d);
        
        tx.commit();
        session.close();
        System.out.println("Done...");
	    
	}

}
