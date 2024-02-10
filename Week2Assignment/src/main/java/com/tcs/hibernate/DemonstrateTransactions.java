package com.tcs.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemonstrateTransactions {

	public static void main(String[] args) {	

		// Set up Configuration & Session
		Configuration configure = new Configuration();
		configure = configure.configure();
		SessionFactory factory = configure.buildSessionFactory();
		//System.out.println(factory);
		Session session = factory.openSession();
		//System.out.println(session);
		Transaction transaction = session.beginTransaction();

		// Declare Domain Objects
		Investor i1 = new Investor(1, "Arun", "shares", 1000);
		Investor i2 = new Investor(2, "Nivaz", "bonds", 3000);
		Investor i3 = new Investor(3, "Sunil", "shares", 2000);
		Investor i4 = new Investor(4, "John", "bonds", 3000);
		Investor i5 = new Investor(5, "Jane", "shares", 2000);
		
		Transactions t1 = new Transactions(1, "01-02-2024", 500, 1);
		Transactions t2 = new Transactions(1, "01-02-2024", 1500, 2);
		Transactions t3 = new Transactions(1, "01-02-2024", 2500, 3);
		Transactions t4 = new Transactions(2, "02-02-2024", 500, 1);
		Transactions t5 = new Transactions(2, "02-02-2024", 1500, 2);
		Transactions t6 = new Transactions(3, "02-02-2024", 2500, 1);
		Transactions t7 = new Transactions(1, "03-02-2024", 500, 4);
		Transactions t8 = new Transactions(1, "03-02-2024", 1500, 5);
		Transactions t9 = new Transactions(1, "04-02-2024", 2500, 9);
		Transactions t10 = new Transactions(1, "04-02-2024", 3500, 10);
		
		// Object to store 
		TransactionsCache tcache = new TransactionsCache();
		
		//Domain Objects will be added to Collection based on Investor ID validation
		tcache.addInvestor(i1);
		tcache.addInvestor(i2);
		tcache.addInvestor(i3);
		tcache.addInvestor(i4);
		tcache.addInvestor(i5);
		tcache.addTransactions(t1);
		tcache.addTransactions(t2);
		tcache.addTransactions(t3);
		tcache.addTransactions(t4);
		tcache.addTransactions(t5);
		tcache.addTransactions(t6);
		tcache.addTransactions(t7);
		tcache.addTransactions(t8);
		tcache.addTransactions(t9);
		tcache.addTransactions(t10);
		
		// Insert Domain Objects using save()
		System.out.println("\n Inserting Investor records into DB");
		for(Investor i : tcache.getInvestors()) {
			session.save(i);
		}
		System.out.println("\n Inserting Transactions records into DB");
		for(Transactions t : tcache.getTransactions()) {
			session.save(t);
		}
		
		// Update Domain Objects using update()
		System.out.println("\n Updating transaction amounts to Investor's balance");
		for(Transactions t : tcache.getTransactions()) {
			Investor inv = session.get(Investor.class, t.getiId());
			if(inv != null) {
				inv.setiAmount(inv.getiAmount() + t.gettAmount());
				System.out.println("Transaction amount: " + t.gettAmount() 
				+ " added to Investor ID: " + inv.getiId() 
				+ " Investor Name: " + inv.getiName() +"'s balance");
			}
			session.update(inv);
		}
		
		// Display all Domain objects using get()
		System.out.println("\n Displaying Domain Objects using get()");
		for(Investor i : tcache.getInvestors()) {
			System.out.println(session.get(Investor.class, i.getiId()));
		}
		for(Transactions t : tcache.getTransactions()) {
			System.out.println(session.get(Transactions.class, t.gettId()));
		}
		
		// Display all Domain objects using Quey object
		System.out.println("\n Displaying Domain Objects using Query object");
		Query<Investor> showAllInvestors = session.createQuery("from Investor");
		List<Investor> investorList = showAllInvestors.list();
		Iterator<Investor> iList = investorList.iterator();
		while(iList.hasNext()) {
			System.out.println(iList.next());
		}
		Query<Transactions> showAllTransactions = session.createQuery("from Transactions");
		List<Transactions> transactionslist = showAllTransactions.list();		
		Iterator<Transactions> tList = transactionslist.iterator();
		while(tList.hasNext()) {
			System.out.println(tList.next());
		}
						
		// Commit transaction & Close Session
		transaction.commit();
		session.close();
	}
}
