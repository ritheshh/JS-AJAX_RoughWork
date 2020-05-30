package com.twonumbers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class CalcServlet extends HttpServlet {

	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		String calc = req.getParameter("submit");
		RequestDispatcher rd;
		
		switch (calc) {
		case "Add":
			rd = req.getRequestDispatcher("add");
			rd.forward(req, resp);
			break;
		case "Subtract":
			rd = req.getRequestDispatcher("sub");
			rd.forward(req, resp);
			break;
		case "Multiply":
			rd = req.getRequestDispatcher("mul");
			rd.forward(req, resp);
			break;
		case "Divide":
			rd = req.getRequestDispatcher("div");
			rd.forward(req, resp);
			break;
		}
	}

}
