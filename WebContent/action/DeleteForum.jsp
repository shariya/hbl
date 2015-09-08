
<%@page import="java.util.Date"%>
<%@ page import="forum.*"%>
<%@ page import="forum.Filter"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.io.*"%>

<%
try{    
	DBConnectie db = new DBConnectie(Variable.getDb(),Variable.getDbLogin(),Variable.getDbPassword());
	session = request.getSession(true);
	String sessionType = (String)session.getAttribute("type");
	
	String forum_id = request.getParameter("forum_id");
	
	if(sessionType.equals("Admin")){

    	db.connect();
    
    	db.query("DELETE FROM forum_message WHERE forum_id=\"" + forum_id + "\"");
    	db.query("DELETE FROM forum_forums WHERE forum_id=\"" + forum_id + "\"");
	 					 
    	db.close();
	
  		response.sendRedirect("../index.jsp");
	}          		
	
}catch(Exception e){
	e.printStackTrace();
}
%>