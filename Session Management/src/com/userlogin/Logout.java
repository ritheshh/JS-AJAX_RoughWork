package com.userlogin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		WelcomeUser objUser = new WelcomeUser();
		boolean validSession = objUser.usernameVerify(req);
		if (!validSession) {
			resp.sendRedirect("login.html");
			return;
		}

		Cookie[] cookieArray = req.getCookies();
		for (Cookie cookie : cookieArray) {
			if (cookie.getName().equals("username")) {
				cookie.setMaxAge(0); // expires immediately
				resp.addCookie(cookie);
			}
		}
		resp.setContentType("text/html");
		resp.getWriter().println("<h3>Thank you</h3>");
		resp.getWriter().println("Click here to login again " + "<form action=\"loginverification\">"
				+ "<input type=\"submit\" value=\"Log-in Again\">" + "</form>");
	}
}
