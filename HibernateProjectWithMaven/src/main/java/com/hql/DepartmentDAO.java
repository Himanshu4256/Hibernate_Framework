package com.hql;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DepartmentDAO {
	
	public static void main(String[] args) {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			
			
			for (int i = 1; i < 10; i++) {
				Department obj = new Department();
				obj.setDeptname("B Tech");
				obj.setName("hedbkv");
				session.save(obj);
			}
			
			
//			for (String string : obj) {
//				
//			}
		    
		    
		    t.commit();
		    session.close();
		    System.out.println("Saved successfully");
		    
		    
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
