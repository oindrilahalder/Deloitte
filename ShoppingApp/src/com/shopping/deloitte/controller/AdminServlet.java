package com.shopping.deloitte.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AdminServlet() {
        super();
        
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String wifeName=request.getParameter("wifeName");
		PrintWriter out = response.getWriter();
		//out.println("<h2>Admin servlet Welcomes : "+username);
		
		HttpSession session=request.getSession();
		session.setAttribute("currentBuyer", username);
		//out.println("<h2><a href=Item.html>Select Products</a>");
		
		out.println("<h2><a href=Item.html> "+username+" please Select Products for "+wifeName+" </a>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
