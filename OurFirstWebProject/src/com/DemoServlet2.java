package com;
//servlet context
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet1
 */
public class DemoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    String name=null;
    String username=null;
	String cm=null;
	String in=null;
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init with servlet config called");//it will be called first
		name= config.getServletName();
		username = config.getInitParameter("username");
		cm = config.getInitParameter("companyname");
		
		ServletContext context=config.getServletContext();
		in=context.getInitParameter("itemName");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init called");
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();//shortcut 
		//response.setContentType("text/plain");//plain text output
		
		response.getWriter().print("<h1>welcome : "+username);//not defined in this servlet.
															//null will come
		response.getWriter().print("<h1>welcome : tufail");
		
		response.getWriter().print("<h1>company name is : "+cm);
		response.getWriter().print("<h1>company name is : deloitte");
		
		out.print("<h1>###item name is : "+in);//defined in context xml 
																//output will come
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
