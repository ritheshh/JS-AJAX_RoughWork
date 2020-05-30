package com.urlrewrite;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class URLRewriteResult extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int result = Integer.parseInt(req.getParameter("squareOf"));
		
		resp.getWriter().println("Result is: " + result);
	}
}
