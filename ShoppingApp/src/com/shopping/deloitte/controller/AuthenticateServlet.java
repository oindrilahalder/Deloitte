package com.shopping.deloitte.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AuthenticateServlet() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
	
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		PrintWriter out = response.getWriter();
		Cookie allCookies[]= request.getCookies();
		boolean alreadyVisited = false;
		if(allCookies != null) {
			for(Cookie c :allCookies) {
				if(c.getName().equals(username)) {
					alreadyVisited = true;
					break;
				}
			}
		}
		out.println("<h2>succesfully authenticated");
		
		if(!alreadyVisited) {
			out.println("<h2>welcome, you have visited my page for first time: "+username);
			Cookie cookie = new Cookie(username,username);
			response.addCookie(cookie);
		}
		else {
			out.println("<h2>welcome, you have already visited this page: "+username);
		}
		
		out.println("<h2><form action='AdminServlet'>");
		out.println("<h2>wife name: <input type='text' name='wifeName'>");
		out.println("<h2><input type = 'hidden' name='username' value="+username);
		out.println("<h2><input type='submit' value='enter'>");
		out.println("<h2></form>");
		
		/*if(username.equalsIgnoreCase("admin"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("AdminServlet");
			dispatcher.forward(request, response);
			out.println("<h2><a href=Item.html>ITEM</a>");
		}
		else if(username.equalsIgnoreCase("guest"))
		{
			//out.println("invalid username or password");
			//out.println("<h2><a href=Index.html>home</a>");
			//response.sendRedirect("loginformvalidation.html");
			RequestDispatcher dispatcher=request.getRequestDispatcher("GuestServlet");
			dispatcher.forward(request, response);
		}
		else
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("OthersServlet");
			dispatcher.forward(request, response);
		}*/
	}

}
