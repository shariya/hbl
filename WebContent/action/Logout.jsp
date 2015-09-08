<%@page import="java.util.Date"%>
<%@ page import="forum.*"%>
<%@ page import="forum.Filter"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.io.*"%>


<%
try {
session = request.getSession(true);

session.removeAttribute("username");
session.removeAttribute("password");
session.removeAttribute("type");
/*
if (cookies != null){
		Cookie cookie;
	for(int i=0;i<cookies.length;i++){
		cookie = cookies[i];
		if(cookie.getName().equals("username")){
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			session.removeAttribute("username");
		}else if(cookie.getName().equals("password")){
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			session.removeAttribute("password");
		}else if(cookie.getName().equals("type")){
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			session.removeAttribute("type");
		}
		
	}					
}*/
        	
response.sendRedirect("../index.jsp");

}catch(Exception e){e.printStackTrace();}


%>