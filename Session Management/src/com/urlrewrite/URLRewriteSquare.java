package com.urlrewrite;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class URLRewriteSquare extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = req.getParameter("num").isEmpty() ? 0 : Integer.parseInt(req.getParameter("num"));
		int square = num * num;
		
		resp.sendRedirect("urlrewrite_result?squareOf=" + square);
	}

}
