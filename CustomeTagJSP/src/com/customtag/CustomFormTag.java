package com.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomFormTag extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
		JspWriter out= pageContext.getOut();
		try {
			out.println("<form><br/>"); 
			out.println("User name: <input type=text>");
			out.println("password: <input type=password>");
			out.println("<input type=submit value=go> </form>");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}

}
