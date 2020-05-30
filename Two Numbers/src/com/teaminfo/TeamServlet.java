package com.teaminfo;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TeamServlet extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * ServletConfig and ServletContext are both interfaces, whose parameters are specified in the Deployment Descriptor.
		 * ServletConfig - config parameters are specific to a servlet.
		 * ServletContext - context parameters are for the entire deployment descriptor and 
		 * 					these parameters can be extracted by any servlet in declared in the web.xml file.
		 */		
		
		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();
		
		String team = config.getInitParameter("teamColor");
		String competition = context.getInitParameter("competitionName");
		
		resp.getWriter().println("COMPETITION - " + competition + "\nThe team colour is: " + team);
	}

}
