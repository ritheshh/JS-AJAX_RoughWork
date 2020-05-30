<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome <%=session.getAttribute("user") %> </h1>
	getRequestedSessionId: <%=request.getRequestedSessionId() %> <br>
	isRequestedSessionIdValid: <b><%=request.isRequestedSessionIdValid() %> </b><br>
	Is session ID from URL: <b><%=request.isRequestedSessionIdFromURL() %> </b><br>
	Is session ID from Cookies: <b><%=request.isRequestedSessionIdFromCookie() %> </b> <br>
	<h3>Methods to get info on 'Request Headers': </h3>
	getHeader(String User-Agent): <%=request.getHeader("User-Agent") %> <br>
	
	<h3>Methods to get the path of request URL:</h3>
	getRequestURI: <%=request.getRequestURI() %> <br>
	getRequestURL: <%=request.getRequestURL() %> <br> <!-- Displays the complete path as per client -->
	getServletPath: <%=request.getServletPath() %> <br> <!-- URI from the context of the application to the mapped path to the servlet in DD -->
	getContextpath: <%=request.getContextPath() %> <br> <br>
	getmethod: <%=request.getMethod() %> <br>
	
	<h3>Security-Related</h3>
	getAuthType: <%=request.getAuthType() %> <br>
	getRemoteuser: <%=request.getRemoteUser() %> <br>
	getuserPrincipal: <%=request.getUserPrincipal() %> <br> <!-- These methods will return null if client is not authenticated -->
	
	<h3>Meta-data properties</h3>
	<%//request.setCharacterEncoding(env) %>
	getCharacterEncoding: <%=request.getCharacterEncoding() %> <br>
	getContentLength: <%=request.getContentLength() %> <br>
	getContentType: <%=request.getContentType() %> <br>
	getProtocol: <%=request.getProtocol() %> <br>
	getScheme: <%=request.getScheme() %> <br><br>
	<a href="<%=response.encodeURL("logout") %>"><input type="submit" value="logout"></a>
	
</body>
</html>