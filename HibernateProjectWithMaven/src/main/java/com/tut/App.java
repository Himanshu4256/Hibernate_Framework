package com.tut;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started..." );
        //SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
//        cfg.buildSessionFactory(); ye sessionFactory ka obj create krke return kr dega.
        
        // creating student
        Student st = new Student();
        st.setId(112);
        st.setName("Rakul");
        st.setCity("Delhi");
        System.out.println(st);
        
        
        
        //creating obj of AddressW_AllNotations
        AddressW_AllNotations ad = new AddressW_AllNotations();
        ad.setStreet("Street 2");
        ad.setCity("Gurugram");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1212.246);  // ye value database m ni jaegi due to @Transient
        
        
        // Reading Image
        
        
        FileInputStream fis = new FileInputStream("src/main/java/MyImg.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data); 
        
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(st);
        session.save(ad);
        
        tx.commit();
        session.close();
        fis.close();
        System.out.println("Done...");
    }
}
