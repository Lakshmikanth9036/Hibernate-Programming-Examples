package com.Biditvats.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Biditvats.domain.Product;


public class SaveProduct {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Product product = new Product("mobile","iphone","Apple","electronics",50000D);
		
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(product);
		transaction.commit();
		session.close();
		
		System.out.println("Reacord have been successfully saved");

	}

}
