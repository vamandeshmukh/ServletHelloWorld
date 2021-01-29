package com.vaman.demo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int count = 0;

	public void init(ServletConfig config) {
		System.out.println("Server initlialzed... value of count is: " + count);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Request number :" + count + " is recieved.");
		count++;
	}

	@Override
	public void destroy() {
		System.out.println("Servlet removed from service.... Total visitor count is: " + count);
	}

}
