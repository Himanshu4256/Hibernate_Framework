package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.states.Student1;

// HQL = Hibernate query language
public class HQl {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		//HQL Syntax
		//String query = "from Student1";  // in SQl means "Select * from Student1" Student1 Table ka data dekhne k liye
		//String query = "from Student1 where city = 'Delhi' ";
		
		
		
		
		//Dynamic value set krne k liye
		String query = "from Student1 where city =:x and s.name =:n";
		//here is a method of Session to create Query
		Query q = s.createQuery(query); // ye es query ko run kraega.
		q.setParameter("x", "Ghaziabaad");
		q.setParameter("n", "Himanshu");
		
		
		//here you have 2 options what you want (1) or (2)
		//(1) Single results (Unique)
		//(2) Multiple-list results (list)
		
		List<Student1> list = q.list();
		for (Student1 st : list) {
			System.out.println(st.getName());
		}
		
		
		System.out.println("--------------------------------------------");
		// delete the data
		Transaction tx = s.beginTransaction();
//		Query q2 = s.createQuery("delete from Student1 s where s.city=:c");
//		q2.setParameter("c", "ABC");
//		int r = q2.executeUpdate();
//		System.out.println("Deleted ");
//		System.err.println(r);
		
		
		
		//Update the data
		Query q2 = s.createQuery("update Student1 set city=:c where name=:n"); 
		q2.setParameter("c", "Pune");
		q2.setParameter("n", "Himanshu");
		
		int r = q2.executeUpdate();
		System.out.println(r +"object updated");
		
		
		
		tx.commit(); 
		
		Query q3 = s.createQuery("select q.question, q.questtionId from Database as INNER JOIN q.answersas a");
		
		List<Object []> list3 = q3.getResultList();
		for (Object[] objects : list3) {
			System.out.println(Arrays.toString(objects));
		}
		
		s.close();
		factory.close();
	}
}
