package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Welcome() {
        super();
    }

	int counter=0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		counter++;
		
		
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String customerName = request.getParameter("customerName");
		String customerAddress = request.getParameter("customerAddress");
		int billAmount = Integer.parseInt(request.getParameter("billAmount"));
		response.getWriter().println("<h1>Welcome to my website: "+customerId);
		response.getWriter().println("<h1>Your id is : "+customerName);
		response.getWriter().println("<h1>Your address is: "+customerAddress);
		response.getWriter().println("<h1>Your billamount is : "+billAmount);
		response.getWriter().println("<h1>you are visitor number: "+counter);
		//response.getWriter().println("<h1><a href='Shop.html'> Shop</a>");
		
		Customer customer = new Customer(customerId,customerName,customerAddress,billAmount);
		
		CustomerDAO customerDAO = new CustomerDAOImpl();
		if(customerDAO.isCustomerExists(customerId))
		{
			response.getWriter().println(customerId+" already exists");
		}
		else
		{
			customerDAO.addCustomer(customer);
			response.getWriter().println(customerName+" added successfully");
		}
	}

}
