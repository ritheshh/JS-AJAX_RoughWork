package com.httpsession;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSessionResult extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false); // returns only a pre-existing session.

		try {
			int result = (int) session.getAttribute("squareOf");
			String sessionId = session.getId();
			long creationTime = session.getCreationTime();
			long lastAccessedTime = session.getLastAccessedTime();
			int maxInactiveinterval = session.getMaxInactiveInterval();

			DateFormat formatter = new SimpleDateFormat();

			resp.setContentType("text/html");
			resp.getWriter().println("<html> <body>");
			resp.getWriter().println("<h3>Result is: " + result + "</h3><br>");
			resp.getWriter().printf("Session ID: %s <br>Creation Time: %s <br>Last Accessed Time: %s " + 
					"<br>Max Inactive Interval: %d <br>",
					sessionId, formatter.format(creationTime), formatter.format(lastAccessedTime), maxInactiveinterval);
			resp.getWriter().println("<form><input type=\"submit\" value=\"Delete Session\" formaction=\"httpsession_delete\"></form>");
			resp.getWriter().println("</body></html>");
		} catch (Exception e) {
			// TODO: handle exception
			resp.getWriter().println("booo");
			e.printStackTrace();
		}
	}
}
