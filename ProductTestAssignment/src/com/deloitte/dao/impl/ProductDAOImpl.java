package com.deloitte.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.model.Product;
import com.deloitte.dao.ProductDAO;

public class ProductDAOImpl implements ProductDAO {

	Configuration configuration=null;  
	SessionFactory factory=null;
	
	public ProductDAOImpl() {
		configuration = new Configuration().configure();
		factory = configuration.buildSessionFactory();
	}
	
	@Override
	public boolean addProduct(Product product) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(product);
		
		transaction.commit();
		session.close();
		return false;
	}

	@Override
	public List<Product> listProduct() {
		Session session = factory.openSession();
		Query query= session.createQuery("from Product");
		List<Product> allProducts = query.list();
		session.close();
		return allProducts;
	}

}
