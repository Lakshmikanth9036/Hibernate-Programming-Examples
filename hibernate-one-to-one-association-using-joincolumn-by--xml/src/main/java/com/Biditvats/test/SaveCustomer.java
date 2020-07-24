package com.Biditvats.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Biditvats.domain.Address;
import com.Biditvats.domain.Customer;


public class SaveCustomer {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		
		Address address = new Address("H-60","Kumaraswamy","Bangalore","Near Police Station","karnataka", 560078L);
		
		Customer customer = new Customer("Bidit","vats","Biditvats@gmail.com",8892550034L);
		
		customer.setAddress(address);
		
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		
		System.out.println("Record have been saved successfully");

	}

}
