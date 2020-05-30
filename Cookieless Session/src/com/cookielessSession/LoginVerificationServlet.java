package com.cookielessSession;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginVerification")
public class LoginVerificationServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String username = req.getParameter("usrnm");
		String password = req.getParameter("pwd");
		
		if(password.equals("pass")) {
			HttpSession session = req.getSession();
			session.setAttribute("user", username);
			resp.sendRedirect(resp.encodeRedirectURL("welcome"));
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			resp.setContentType("text/html");
			out.print("<font color=red>Either user name or password is wrong.</font>");
			rd.include(req, resp);
		}
		
		
		

	} 
}
