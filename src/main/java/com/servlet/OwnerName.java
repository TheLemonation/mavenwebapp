package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OwnerName
 */
public class OwnerName extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 if(request.getParameter("search")!=null){
			   String name=request.getParameter("ownername");
			   OwnerDAO1 od=new OwnerDAO1(); 
			   OwnerDTO o=od.findOwnerByName(name);
		   PrintWriter out=response.getWriter();
		   out.println("<table><tr><td>"+o.getId());
		   out.println("</td><td>"+o.getFname());
		   out.println("</td><td>"+o.getLname());
		   out.println("</td><td>"+o.getAddress());
		   out.println("</td><td>"+o.getCity());
		   out.println("</td><td>"+ o.getTelephone());
		  		   }
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
