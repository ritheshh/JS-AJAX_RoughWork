package com.twonumbers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubtractServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1 = req.getParameter("num1").isEmpty() ? 0 : Integer.parseInt(req.getParameter("num1"));
		int num2 = req.getParameter("num2").isEmpty() ? 0 : Integer.parseInt(req.getParameter("num2"));

		int dif = num1 - num2;
		resp.getWriter().printf("RESULT: %d - %d = %d",num1, num2, dif);
	}
}
