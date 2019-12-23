package com.HttpSession.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/second")
public class SecondServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uqual = request.getParameter("uqual");
		String udesig = request.getParameter("udesig");
		HttpSession httpSession = request.getSession(false);
		httpSession.setAttribute("uqual", uqual);
		httpSession.setAttribute("udesig", udesig);
		RequestDispatcher rd = request.getRequestDispatcher("form3.html");
		rd.forward(request, response);
	}

}
