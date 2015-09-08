
<%@page import="java.util.Date"%>
<%@ page import="forum.*"%>
<%@ page import="forum.Filter"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.io.*"%>

<%
	DBConnectie db = new DBConnectie(Variable.getDb(), Variable.getDbLogin(), Variable.getDbPassword());
	try {

		session = request.getSession(true);
		String sessionType = (String) session.getAttribute("type");
		String forum_id = request.getParameter("forum_id");
		String thread_id = request.getParameter("thread_id");

		if (sessionType.equals("Admin")) {

			db.connect();

			db.query("DELETE FROM forum_message WHERE forum_id=\"" + forum_id + "\" AND thread_id=\""
					+ thread_id + "\"");
			db.query("DELETE FROM forum_threads WHERE forum_id=\"" + forum_id + "\" AND thread_id=\""
					+ thread_id + "\"");

			db.close();

			response.sendRedirect("../index.jsp?page=thread&forum_id=" + forum_id);
		}

	} catch (Exception e) {
		e.printStackTrace();
	}
