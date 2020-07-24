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
		Product product1 = session.get(Product.class, 1L);
		Product product2 = session.get(Product.class, 1L);
		Product product3 = session.get(Product.class, 1L);
		Product product4 = session.get(Product.class, 1L);
		session.clear();
	}
}
