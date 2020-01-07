package com;
//servlet config
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet1
 */
public class DemoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    String name=null;
    String username=null;
	String cm=null;
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init with servlet config called");//it will be called first
		name= config.getServletName();
		username = config.getInitParameter("username");
		cm = config.getInitParameter("companyname");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init called");
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("<h1>welcome : "+username);
		response.getWriter().print("<h1>welcome : tufail");
		
		response.getWriter().print("<h1>company name is : "+cm);
		response.getWriter().print("<h1>company name is : deloitte");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
