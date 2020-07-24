package com.Biditvats.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Biditvats.domain.CurrentAccount;
import com.Biditvats.domain.LoanAccount;
import com.Biditvats.domain.SavingAccount;


public class GetAccountDetails {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		SavingAccount savingAccount = session.get(SavingAccount.class, 1L);
		CurrentAccount currentAccount = session.get(CurrentAccount.class, 2L);
		LoanAccount loanAccount = session.get(LoanAccount.class, 3L);
		session.close();
		
		System.out.println(savingAccount);
		System.out.println(currentAccount);
		System.out.println(loanAccount);

	}
}
