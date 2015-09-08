
<%@page import="java.util.Date"%>
<%@ page import="forum.*"%>
<%@ page import="forum.Filter"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.io.*"%>

<%
	try {
		DBConnectie db = new DBConnectie(Variable.getDb(), Variable.getDbLogin(), Variable.getDbPassword());

		int lastforum_id = Integer.parseInt(request.getParameter("lastforum_id"));
		String forum_id = Integer.toString(lastforum_id + 1);

		String title = request.getParameter("title");
		if (title.equals("")) {
			title = "No title";
		} else {
			title = Filter.filterAll(title);
		}

		String forum_info = request.getParameter("forum_info");
		forum_info = Filter.filterAll(forum_info);

		db.connect();

		db.query("INSERT INTO forum_forums(forum_id,title,forum_info) " + "VALUES(\"" + forum_id + "\",\""
				+ title + "\",\"" + forum_info + "\")");

		db.close();

		response.sendRedirect("../index.jsp");

	} catch (Exception e) {
		e.printStackTrace();
	}
%>