package com.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomName extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
		JspWriter out= pageContext.getOut();
		try {
			out.println("Oindrila"); 
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}

}
