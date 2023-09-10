package com.single.table.hibernate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import net.sf.ehcache.search.parser.ParseException;

public class HibernateRunner {
	public static void main(String[] args) throws ParseException {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Parent p = new Parent();
		p.setName("Rahul");
		p.setGender("Male");
		
		
		Child1 c1 = new Child1();
		c1.setBonus(new BigDecimal("800.50"));
		c1.setDeptName("Software Engineer");
		c1.setDoj(LocalDate.of(20233, Month.JULY, 24));
		c1.setEmail("himanshu@gmail.com");
		c1.setName("Himanshu Sharma");
		c1.setSalary(100000.68);
		c1.setGender("Male");
		
		Child2 c2 = new Child2();
		c2.setName("Vanya");
		c2.setGender("Female");
		c2.setFee(30000);
		c2.setSchoolName("DPS");
		c2.setSchoolName("12th Std");
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.beginTransaction();
		
		try {
		session.save(p);
		session.save(c1);
		session.save(c2)
		;
		}
		 catch (Exception e) {
		        e.printStackTrace();
		    }
		
		session.getTransaction().commit();
		
		

	}

}
