package com.tcs.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {

		Configuration configure = new Configuration();
		configure = configure.configure();
		
		SessionFactory factory = configure.buildSessionFactory();
		System.out.println(factory);
		
		Session session = factory.openSession();
		System.out.println(session);
		
		Transaction transaction = session.beginTransaction();
		
		Employee emp = session.get(Employee.class, 1);
		session.delete(emp);
		
//		fetch a row from db
//		Employee emp = session.get(Employee.class, 1);
//		System.out.println(emp);
//		emp.setSal(50000);
//		
//		session.update(emp);
//		System.out.println(emp);
		
//		emp = session.get(Employee.class, 0);
//		System.out.println(emp);
		
//		Employee emp = new Employee();
//		emp.setEname("Jane Doe");
//		emp.setSal(25000);
//		session.save(emp);

		transaction.commit();
		session.close();
		
	}
}
