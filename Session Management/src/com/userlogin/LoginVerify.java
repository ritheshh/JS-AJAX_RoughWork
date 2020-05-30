package com.userlogin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class LoginVerify extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("usrnm") == null ? ""
				: (req.getParameter("usrnm").isEmpty() ? "" : req.getParameter("usrnm"));
		String password = req.getParameter("pwd") == null ? ""
				: (req.getParameter("pwd").isEmpty() ? "" : req.getParameter("pwd"));
		boolean sessionFlag = true;

		Cookie[] cookieArray = req.getCookies();
		if (cookieArray == null && username.isEmpty()) {
			resp.sendRedirect("login.html");
		} else if (cookieArray != null) {
			for (Cookie cookie : cookieArray) {
				if (cookie.getName().equals("username")) {
					username = cookie.getValue();
					sessionFlag = false;
				}
			}
		}
		if (username.equals("admin") && (password.equals("pass") || sessionFlag == false) ) {
			if (sessionFlag) {
				Cookie cookie = new Cookie("username", username);
				if (req.getParameter("storeCookie") != null)
					cookie.setMaxAge(365 * 24 * 60 * 60); //seconds
			resp.addCookie(cookie);
			}
			resp.sendRedirect("welcomeuser");
		}
	}
}
