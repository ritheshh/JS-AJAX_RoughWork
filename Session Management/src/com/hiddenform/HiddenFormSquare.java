package com.hiddenform;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenFormSquare extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = req.getParameter("num").isEmpty() ? 0 : Integer.parseInt(req.getParameter("num"));
		int square = num * num;

		resp.setContentType("text/html");

		resp.getWriter().println("<html><body>");
		resp.getWriter().println("<form action=\"hiddenform_result\">" 
						+ "<input type=\"hidden\" name=\"squareOf\" value=\""
						+ square + "\" >" + "<input type=\"submit\" value=\"Find the squareOf\">" + "</form>");
		resp.getWriter().println("</body></html>");

	}
}
