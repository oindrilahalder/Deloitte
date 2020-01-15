package com.pms.deloitte.service;

import java.util.List;

import com.pms.deloitte.model.Product;

public interface ProductService {
	public void addProduct(Product product);
	public void deleteProduct(int productId);
	public void updateProduct(Product product);
	public Product getProduct(int productId);
	public boolean isProductExists(int productId);
	public List<Product> listProducts();
	public List<Product> listProducts(String productName);
	public List<Product> listProducts(int price);
}
