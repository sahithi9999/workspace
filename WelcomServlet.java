package com;

import java.io.IOException;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomServlet
 */
public class WelcomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("userName");  
		    out.print("Welcome "+n);  
		    }  
		  
	}

