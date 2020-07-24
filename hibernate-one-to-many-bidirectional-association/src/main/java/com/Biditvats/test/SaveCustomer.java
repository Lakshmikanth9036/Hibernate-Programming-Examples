package com.Biditvats.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Biditvats.domain.Address;
import com.Biditvats.domain.Customer;


public class SaveCustomer {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Address address1 = new Address("H-60", "Kumaraswamy Layout", "Bangalore", "Near Police Station", "KA", 560078L);
		Address address2 = new Address("H-6", "Kumaraswamy Layout", "Bangalore", "Near Police station", "KA", 560078L);
		
		List<Address> addresses = new ArrayList<>();
		addresses.add(address1);
		addresses.add(address2);
		
		Customer customer = new Customer("Bidit", "vats", "Biditvats@gmail.com", 9916712669L);
		customer.setAddresses(addresses);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		
		System.out.println("Record has been saved successfully!");
	}
}
