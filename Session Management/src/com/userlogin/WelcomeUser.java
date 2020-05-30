package com.userlogin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WelcomeUser extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		boolean validSession = usernameVerify(req);
		if(!validSession) {
			resp.sendRedirect("login.html");
			return;
		}
		resp.setContentType("text/html");
		resp.getWriter().println("<h1>Welcome ADMIN</h1>");
		resp.getWriter().println("<form action=\"logout\">" + "<input type=\"submit\" value=\"Log-out\">" + "</form>");
	}

	boolean usernameVerify(HttpServletRequest req) {
		String username = "";
		Cookie[] cookieArray = req.getCookies();
		if(cookieArray == null)
			return false;
		for (Cookie cookie : cookieArray) {
			if (cookie.getName().equals("username"))
				username = cookie.getValue();
		}
		return username.equals("admin");
	}
}
