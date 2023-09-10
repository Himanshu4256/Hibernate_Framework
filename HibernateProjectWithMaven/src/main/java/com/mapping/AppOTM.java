package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppOTM {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		//create question
		QuestionOneToMany q = new QuestionOneToMany();
		q.setQuestion_id(1212);
		q.setQuestion("what is Hibernate");
		
		
//		//create answer
		AnswerOneTOMany answer = new AnswerOneTOMany();
		answer.setAnswer_Id(342);
		answer.setAnswer("Hibernate ORM is an object–relational mapping tool");
		answer.setQuestion(q);
		
		AnswerOneTOMany answer1 = new AnswerOneTOMany();
		answer1.setAnswer_Id(343);
		answer1.setAnswer("Hibernate reduces lines of code by maintaining object-table mapping itself and returns result to application in form of Java objects.");
		answer1.setQuestion(q);
		
		AnswerOneTOMany answer2 = new AnswerOneTOMany();
		answer2.setAnswer_Id(344);
		answer2.setAnswer("हाइबरनेट ऑब्जेक्ट-टेबल मैपिंग को बनाए रखते हुए कोड की पंक्तियों को कम करता है और जावा ऑब्जेक्ट के रूप में एप्लिकेशन को परिणाम लौटाता है। ");
		answer2.setQuestion(q);
		
		
		List<AnswerOneTOMany> list = new ArrayList<AnswerOneTOMany>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);
		
		q.setAnswers(list);
		
		//session
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		//save
		s.save(q);
		s.save(answer);
		s.save(answer1);
		s.save(answer2);
		
		
		
		// Data ko fetch kre k liya Question & answer show krne k liye
		
//		QuestionOneToMany q1 = (QuestionOneToMany) s.get(QuestionOneToMany.class,344);
//		System.out.println(q1.getQuestion());
//		for(AnswerOneTOMany a : q1.getAnswers()) {
//		System.out.println(a.getAnswer());
//		}
		
		tx.commit();
		s.close();
		factory.close();
		
	}

}
