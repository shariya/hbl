
<%@page import="java.util.Date"%>
<%@ page import="forum.*"%>
<%@ page import="forum.Filter"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.io.*"%>

<%
	DBConnectie db = new DBConnectie(Variable.getDb(), Variable.getDbLogin(), Variable.getDbPassword());
	try {
		String start = request.getParameter("start");
		String forum_id = request.getParameter("forum_id");
		int lastReply_id = Integer.parseInt(request.getParameter("lastReply_id"));
		String reply_id = Integer.toString(lastReply_id + 1);

		String thread_id = request.getParameter("thread_id");
		String message = request.getParameter("message");
		message = Filter.filterAll(message);

		String user = request.getParameter("user");

		db.connect();

		db.query("INSERT INTO forum_message(forum_id,thread_id,reply_id,message,user,date_time) " + "VALUES(\""
				+ forum_id + "\",\"" + thread_id + "\",\"" + reply_id + "\",\"" + message + "\",\"" + user
				+ "\",SYSDATE())");

		db.close();

		response.sendRedirect("../index.jsp?page=message&forum_id=" + forum_id + "&thread_id=" + thread_id
				+ "&start=" + start);

	} catch (Exception e) {
		e.printStackTrace();
	}
%>