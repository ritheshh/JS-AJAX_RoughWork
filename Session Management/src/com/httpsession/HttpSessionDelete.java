package com.httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/httpsession_delete")
public class HttpSessionDelete extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		try {
		session.removeAttribute("squareOf");
		session.invalidate();
		resp.sendRedirect("square.html");
		} catch(Exception e) {
			// It will throw an IllegalStateException if the session is already invalidated.
			// If the session is fine, but the attribute is not to be found then it throws a NullPointerException.
		}
	}
}
