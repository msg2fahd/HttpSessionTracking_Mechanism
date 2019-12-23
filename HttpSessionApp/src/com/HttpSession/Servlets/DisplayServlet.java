package com.HttpSession.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("uemail");
		String umob = request.getParameter("umob");
		HttpSession hs = request.getSession();
		String uname = (String)hs.getAttribute("uname");
		String uage = (String)hs.getAttribute("uage");
		String uqual = (String)hs.getAttribute("uqual");
		String udesig = (String)hs.getAttribute("udesig");
		out.println("<html>");
		out.println("<body bgcolor='blue'>");
		out.println("<center><br><br>");
		out.println("<h1 style='color:red;'>");
		out.println("KUCH V INSTITUTE OF TECHNOLOGY");
		out.println("</h1>");
		out.println("<h1> Registration Details</h1>");
		out.println("<table border='1'>");
		out.println("<tr><td>User Name</td><td>"+uname+"</td></tr>");
		out.println("<tr><td>User Age</td><td>"+uage+"</td></tr>");
		out.println("<tr><td>User Qualification</td><td>"+uqual+"</td></tr>");
		out.println("<tr><td>User Designation</td><td>"+udesig+"</td></tr>");
		out.println("<tr><td>User Email</td><td>"+email+"</td></tr>");
		out.println("<tr><td>User Mobile</td><td>"+umob+"</td></tr>");
		out.println("<tr><td>Status</td><td>SUCESS</td></tr>");
		out.println("</table></center></body></html>");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
