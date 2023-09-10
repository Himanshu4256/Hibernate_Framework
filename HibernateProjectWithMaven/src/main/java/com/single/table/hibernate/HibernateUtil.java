package com.single.table.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;

public class HibernateUtil {
	private static StandardServiceRegistry standardServiceRegistry;
	private static SessionFactory sessionFactory;
	
	static {
		try {
			if(sessionFactory == null) {
				//Create StandardServiceRegistry
				
				standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
				
				//create MetadataSources
				MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
				
				//create metadata
				org.hibernate.boot.Metadata metadata = metadataSources.getMetadataBuilder().build();
				sessionFactory = metadata.getSessionFactoryBuilder().build();
				
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(standardServiceRegistry!=null) {
				StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
			}
		}
	}
}
