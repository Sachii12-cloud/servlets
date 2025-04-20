package com.jspiders.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet1 extends GenericServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String firstName= req.getParameter("first_name");
        String lastName= req.getParameter("last_name");
		res.setContentType("text/html");
		PrintWriter  writer = res.getWriter();
		writer.println("<h1>helo "+firstName+" "+lastName+"</h1>");
		
	}
	
	

}
