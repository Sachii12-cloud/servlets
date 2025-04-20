package com.jspiders.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/my-servlet-2")
public class MyServlet2 extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	

	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String email =req.getParameter("email");
	    String password =req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>helo "+email+" Your password is  "+password+"</h1>");
		 
	}
	
	
	

	
	
	

        

}
