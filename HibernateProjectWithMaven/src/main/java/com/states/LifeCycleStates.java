package com.states;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class LifeCycleStates {
	public static void main(String[] args) {
		//Practical of Hibernate Object state
		//Transient
		//Persistent
		//Detached
		//Removed
		
		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//creating Student1 object
		Student1 student1 = new Student1();
		student1.setId(1124);
		student1.setName("Ekta");
		student1.setCity("Ghaziabaad");
		student1.setCerti(new Certificate1("Java Hibernate Course","2 months"));
		
		
		
		// HERE Student1 COMES IN [TRANSIENT STATE] BCOZ ABHI YE OBJECT KISI DATABASE YA SESSION K SAAT ASSOCIATED NAHI HAI
		
		
		Session s = f.openSession();
		Transaction ts = s.beginTransaction(); // Transaction hme database m jo actual changes hue hai use show krega.
		s.save(student1);
		// HERE Student1 [PERSISTENT STATE]  MAI AA GYA HAI BCOZ AB YE DATABASE MAI SAVE KR DIYA HAI.
		
		//yha ham name badal rahe hai
		//persistent state mai jase value change kroge jase hi commit kroge to DB mai value auto change ho jaegi. 
		student1.setName("Himanshu");
	
		
		
		
		//NOW ham Detached state mai obj ko le jaenge esme obj Session se delete ho jata hai pr DB mai save rehta hai. to ese krne k liye Transaction commit k baad Session ko close kr denge;
		
		
		ts.commit();
		s.close();
		// ab eske baad value update krenge to ye ni hoga
		
		
		// HERE student1 [DETACHED STATE] MAI AA GYA.
		student1.setName("Vishal");
		
		
		
		// REMOVE STATE :- simple DB se value utao aur ese get() krke remove()/delete() call kr lo to aapka obj delete ho jaega
						   // ese hmne Pactically ni kiya	
		
		
		f.close();
		
	}

}
