package onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String args[]) {

		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		
		Customer c1 = new Customer();

		c1.setCustomerId(781);
		c1.setCustomerName("Tufail");

		CreditCard card1 = new CreditCard();

		card1.setCreditCardId(9272);
		card1.setBankName("ICICI");

		CreditCard card2 = new CreditCard();

		card2.setCreditCardId(9273);
		card2.setBankName("HDFC");
		
		CreditCard card3 = new CreditCard();

		card3.setCreditCardId(9274);
		card3.setBankName("Kotak");
		Set s = new HashSet();

		s.add(card1);
		s.add(card2);
		s.add(card3);

		c1.setAllCards(s);

		Transaction tx = session.beginTransaction();

		session.save(c1);

		tx.commit();
		session.close();
		System.out.println("Customer and Credit card details saved!!");
		factory.close();

	}
}
