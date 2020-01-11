package com.deloitte.dao;

import java.util.List;

import com.deloitte.model.Product;

public interface ProductDAO {
	public boolean addProduct(Product product);
	public List<Product> listProduct();
}
