package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	public static SessionFactory factory;
	
	//factory use krne k liye
	public SessionFactory getFactory()
	{
		if(factory==null) 
		{
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		
		return factory;
	}
	
	
	// factory close krne k liye method banaya (agr open hai to)
	public void closeFactory() {
		if(factory.isOpen()) {
			factory.close();
		}
	}

}
