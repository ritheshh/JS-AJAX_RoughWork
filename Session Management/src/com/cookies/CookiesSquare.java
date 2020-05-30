package com.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.SendResult;

public class CookiesSquare extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int num = req.getParameter("num").isEmpty() ? 0 : Integer.parseInt(req.getParameter("num"));
		int square = num * num;
		
		Cookie cookie = new Cookie("squareOf", String.valueOf(square));
		//cookie.setMaxAge(30*60);
		((HttpServletResponse)res).addCookie(cookie);
		
		((HttpServletResponse)res).sendRedirect("cookies_result") ;
	}
}
