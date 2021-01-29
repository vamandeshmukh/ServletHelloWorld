package com.vaman.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<html><head>");
		out.print("<title>Hello Servlet</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Welcome to the world of Servlets.<h1>");
		out.print("</body>");
		out.print("</html>");
	}

}
