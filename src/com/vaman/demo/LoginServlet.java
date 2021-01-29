package com.vaman.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		if ("admin".equals(userName) && "password".equals(password)) {
			response.sendRedirect("SuccessServlet?userName" + userName);
		} else {
			PrintWriter out = response.getWriter();
			out.print("<html><head>");
			out.print("<title>My First Servlet</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("The entered credentials did not match.");
			out.print("</body>");
			out.print("</html>");
		}

	}

}
