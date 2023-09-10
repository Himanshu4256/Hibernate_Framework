package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMap {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating Question
		QuestionOneToOne q1 = new QuestionOneToOne();
		q1.questionId = 134;
		q1.question = "what is java ?";

		// creating answer
		AnswerOneToOne ans = new AnswerOneToOne();
		ans.answerId = 422;
		ans.answer = "Java is programming language";

		q1.setAnswer(ans);

		// creating Question
		QuestionOneToOne q2 = new QuestionOneToOne();
		q2.questionId = 242;
		q2.question = "what is Collection Framework ?";

		// creating answer
		AnswerOneToOne ans1 = new AnswerOneToOne();
		ans1.answerId = 344;
		ans1.answer = "API to work with objects in java";

		q2.setAnswer(ans1);
		
		// session
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		// save
		s.save(q1);
		s.save(q2);
		s.save(ans);
		s.save(ans1);
		tx.commit();
		s.close();

		factory.close();
	}

}
