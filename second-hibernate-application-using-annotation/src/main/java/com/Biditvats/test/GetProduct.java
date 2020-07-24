package com.Biditvats.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Biditvats.domain.Product;



public class GetProduct {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Product product = session.get(Product.class, 2L);
		System.out.println(product);
		session.close();

	}

}
