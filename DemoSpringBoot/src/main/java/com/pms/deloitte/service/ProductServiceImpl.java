package com.pms.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
	
	@Override
	@Transactional
	public void addProduct(Product product) {
		productDAO.save(product);
	}

	@Override
	@Transactional
	public void deleteProduct(int productId) {
		productDAO.deleteById(productId);
	}

	@Override
	@Transactional
	public void updateProduct(Product product) {
		if(productDAO.existsById(product.getProductId()))
			productDAO.save(product);
	}

	@Override
	@Transactional
	public Product getProduct(int productId) {
		Optional<Product> optionalProduct = productDAO.findById(productId);
		Product product = new Product();
		if(optionalProduct.isPresent())
			product=optionalProduct.get();
		
		return product;

	}

	@Override
	@Transactional
	public boolean isProductExists(int productId) {
		
		return productDAO.existsById(productId);
	}

	@Override
	@Transactional
	public List<Product> listProducts() {
		
		return (List<Product>)productDAO.findAll();
	}

	@Override
	@Transactional
	public List<Product> listProducts(String productName) {
		
		return productDAO.findByProductName(productName);
	}

	@Override
	@Transactional
	public List<Product> listProducts(int price) {
		
		return productDAO.findByPrice(price);
	}

}
