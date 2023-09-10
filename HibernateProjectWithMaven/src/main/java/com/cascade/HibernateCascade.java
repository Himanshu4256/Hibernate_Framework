package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateCascade {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = factory.openSession();
		
		CascadingQuestion q2 = new CascadingQuestion();
		q2.setQuestion_id(334);
		q2.setQuestion("Explain Lombok tool");
		
		CascadingAnswer b1 = new CascadingAnswer(444,"to shorten the code");
		CascadingAnswer b2 = new CascadingAnswer(555,"Use Annotations");
		CascadingAnswer b3 = new CascadingAnswer(666,"code easyness");
		
		List<CascadingAnswer> list1 = new ArrayList<CascadingAnswer>();
		list1.add(b1);
		list1.add(b2);
		list1.add(b3);
		
		q2.setAnswers(list1);
		
		Transaction tx = s.beginTransaction();
		//Question
	    s.save(q2);  //hamne Question save to cascade ki help se sabhi ko save ho gye
		//Answer - ab hamne Que Entity mai "cascade lga diya hai to manually save krne ki jrurat ni hai"
//	    s.save(b1);
//	    s.save(b2);
//	    s.save(b3);
	    
		
		tx.commit();
		s.close();
		factory.close();
		
	}

}
