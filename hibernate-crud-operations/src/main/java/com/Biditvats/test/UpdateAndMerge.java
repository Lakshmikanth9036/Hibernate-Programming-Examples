package com.Biditvats.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Biditvats.domain.Customer;



public class UpdateAndMerge {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		//Session session1 = factory.openSession();
		/*Session session1 = factory.openSession();
		Transaction transaction1 = session1.beginTransaction();
		Customer customer1 = session1.get(Customer.class, 2L);
		customer1.setEmail("abc@biditvats.com");
		transaction1.commit();
		session1.close();
		
		Session session2 = factory.openSession();
		Transaction transaction2 = session2.beginTransaction();
		Customer customer2 = session2.get(Customer.class, 2L);
		customer2.setLastName("MNP");
		session2.update(customer1);
		transaction2.commit();
		session2.close();*/
		
	  Session session1 = factory.openSession();
		Transaction transaction1 = session1.beginTransaction();
		Customer customer1 = session1.get(Customer.class, 2L);
		customer1.setEmail("Adityajha@gmail.com");
	    transaction1.commit();
	    session1.close();
		
	    
	    Session session2 = factory.openSession();
	    Transaction transaction2 = session2.beginTransaction();
	    Customer customer2 = session2.get(Customer.class, 3L);
	    customer2.setLastName("JHA");
	    session2.merge(customer1);
	    transaction2.commit();
	    session2.close();
	    

	}

}
