package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Employee employee = new Employee(1222, "kalpana");
		session.save(employee);

		RegularEmployee employee1 = new RegularEmployee(41000, 9000);
		employee1.setEmployeeId(112);
		employee1.setEmployeename("Arjun");
		session.save(employee1);

		ContractEmployee employee11 = new ContractEmployee(20, 1000);
		employee11.setEmployeeId(123);
		employee11.setEmployeename("mohan");

		session.save(employee11);

		tx.commit();
		session.close();
		System.out.println("Done");
		factory.close();

	}

}
