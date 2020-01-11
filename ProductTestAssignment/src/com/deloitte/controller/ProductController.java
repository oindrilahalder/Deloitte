package com.deloitte.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.dao.impl.ProductDAOImpl;
import com.deloitte.model.Product;

public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProductController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int productId = Integer.parseInt(request.getParameter("productid"));
		String productName = request.getParameter("productname");
		int qoh = Integer.parseInt(request.getParameter("qoh"));
		int price = Integer.parseInt(request.getParameter("price"));

		Product product = new Product(productId, productName, qoh, price);
		HttpSession session = request.getSession();
		session.setAttribute("productId", productId);
		session.setAttribute("productName", productName);
		session.setAttribute("qoh", qoh);
		session.setAttribute("price", price);
		//session.setAttribute("productDetails", product);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("display.jsp");
		dispatcher.forward(request, response);
		
		ProductDAOImpl productdao= new ProductDAOImpl();
		productdao.addProduct(product);

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}