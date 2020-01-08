package manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeDetails emp1 = new EmployeeDetails(1019, "Radha", 19000);
		EmployeeDetails emp2 = new EmployeeDetails(1020, "Ram", 19000);
		
		AddressDetails addressDetails1 = new AddressDetails(111,"pune","MH");
		AddressDetails addressDetails2 = new AddressDetails(112,"mumbai","MH");
		AddressDetails addressDetails3 = new AddressDetails(113,"bangalore","KR");
		AddressDetails addressDetails4 = new AddressDetails(114,"kochi","KA");
		AddressDetails addressDetails5 = new AddressDetails(115,"bhubneshwar","OR");
		
		Set addressSet1 = new HashSet();
		addressSet1.add(addressDetails4);
		addressSet1.add(addressDetails3);
		addressSet1.add(addressDetails2);
		
		emp1.setEmployeeAddress(addressSet1);
		emp2.setEmployeeAddress(addressSet1);
		
		Transaction transaction = session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		
		transaction.commit();
		
		System.out.println("Saved all the data");

	}

}
