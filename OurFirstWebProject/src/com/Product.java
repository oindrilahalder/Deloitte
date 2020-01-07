package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Product() {
        System.out.println("cons called");
    }
    
    @Override
    public void init() throws ServletException {
    	System.out.println("init called");
    	super.init();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doget called");
		String usern = request.getParameter("username");
		String pass = request.getParameter("Password");
		response.getWriter().println("<body bgcolor=orange><h1>Welcome to my website: "+usern);
		response.getWriter().println("<h1>Your password is : "+pass);
		response.getWriter().println("<h1><a href='Shop.html'> Shop</a>");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("dopost called");
		String usern = request.getParameter("username");
		String pass = request.getParameter("Password");
		response.getWriter().println("<body bgcolor=blue><h1>Welcome to my website: "+usern);
		response.getWriter().println("<h1>Your password is : "+pass);
		response.getWriter().println("<h1><a href='Shop.html'> Shop</a>");
    }

	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service called");
		String usern = request.getParameter("username");
		String pass = request.getParameter("Password");
		response.getWriter().println("<body bgcolor=green><h1>Welcome to my website: "+usern);
		response.getWriter().println("<h1>Your password is : "+pass);
		response.getWriter().println("<h1><a href='Shop.html'> Shop</a>");
	}*/
	
	@Override
	public void destroy() {
		System.out.println("destroy called");
		super.destroy();
	}

}
