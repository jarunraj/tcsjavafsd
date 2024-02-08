package com.tcs.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TestHibernate2 {

	public static void main(String[] args) {

		Configuration configure = new Configuration();
		configure = configure.configure();
		
		SessionFactory factory = configure.buildSessionFactory();
		System.out.println(factory);
		
		Session session = factory.openSession();
		System.out.println(session);
		
		// Fetch multiple rows from db
		
		Query<Employee> query = session.createQuery("from Employee");
		List<Employee> list = query.list();
		Iterator<Employee> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
//		Transaction transaction = session.beginTransaction();
//		
//		Investor i1 = new Investor();
//		i1.setName("Sunil");
//		i1.setAddress("Chennai");
//		i1.setAmount(1);
//		session.save(i1);
//		
//		Investor i2 = new Investor();
//		i2.setName("Nivaz");
//		i2.setAddress("Coimabatore");
//		i2.setAmount(10);
//		session.save(i2);
//		
//		Investor i3 = new Investor();
//		i3.setName("Raja");
//		i3.setAddress("Madurai");
//		i3.setAmount(25000);
//		session.save(i3);

//		transaction.commit();
		session.close();
	
	}
}
