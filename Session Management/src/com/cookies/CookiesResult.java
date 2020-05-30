package com.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookiesResult extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Cookie cookiesArray[] = ((HttpServletRequest)req).getCookies();
		int result = 0;
		
		for(Cookie cookie : cookiesArray) {
			if(cookie.getName().equals("squareOf"))
				result = Integer.parseInt(cookie.getValue());
		} 
		
		res.getWriter().println("Result: " + result);
	}

}
