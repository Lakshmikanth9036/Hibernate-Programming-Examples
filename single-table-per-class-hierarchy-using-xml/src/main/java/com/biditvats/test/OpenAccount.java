package com.biditvats.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.biditvats.domain.CurrentAccount;
import com.biditvats.domain.LoanAccount;
import com.biditvats.domain.SavingAccount;

public class OpenAccount {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		SavingAccount savingAccount = new SavingAccount(1000.00, 101L, 6.5);
		CurrentAccount currentAccount = new CurrentAccount(20000.00, 102L, 10000.00, 100);
		LoanAccount loanAccount = new LoanAccount(50000.00, 103L, 11.5, 6500.00, 35500.00);
		
		Session session = sessionFactory.openSession();
		Transaction tranasaction = session.beginTransaction();
		Long savingAccNo = (Long) session.save(savingAccount);
		Long currentAccNo = (Long) session.save(currentAccount);
		Long loanAccNo = (Long) session.save(loanAccount);
		
		tranasaction.commit();
		session.close();
		
		System.out.println("Saving Account Number: "+savingAccNo);
		System.out.println("Current Account Number: "+currentAccNo);
		System.out.println("Loan Account Number: "+loanAccNo);

	}

}
