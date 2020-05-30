package com.ajaxform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class SubmitForm extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String rollNo = req.getParameter("rollNo");
		PrintWriter out = resp.getWriter();
		//out.print("Hello");
		out.println("Name of the user: " + name + "<br>Roll No. of the user: " + rollNo);
		
	}

}
