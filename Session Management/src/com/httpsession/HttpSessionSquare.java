package com.httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSessionSquare extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = req.getParameter("num").isEmpty() ? 0 : Integer.parseInt(req.getParameter("num"));
		int square = num * num;
		
		/*
		 * HttpSession session = 	req.getSession(); - returns a session if it already exists else creates a new session. 
		 * 							req.getSession(true); - always returns a new session. 
		 * 							req.getSession(true); - returns only a pre-existing session.
		 * 
		 * session.invalidate() - destroys a session.
		 */
		
		HttpSession session = req.getSession();
		session.setAttribute("squareOf", square);
		
		resp.sendRedirect("httpsession_result");
	}
}
