

<%@page import="java.util.Date"%>
<%@ page import="forum.*" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.io.*" %>
<%
    DBConnectie db = new DBConnectie(Variable.getDb(),Variable.getDbLogin(),Variable.getDbPassword());
	//out = response.getWriter();
	try {
		//Cookie[] cookies = request.getCookies();
		//String username = Cookies.getCookies(cookies,"username","null");
		//String password = Cookies.getCookies(cookies,"password","null");
		//String type = Cookies.getCookies(cookies,"type","null");

		String RegUser = request.getParameter("user");
		String RegEmail = request.getParameter("email");
		String RegPass = request.getParameter("password");
		String RegPass2 = request.getParameter("password2");
		System.out.println("Entered");
		db.connect();
		ResultSet rs = db
				.selectQuery("SELECT * " + "FROM forum_users " + "WHERE user_name=\"" + RegUser + "\"");

		String DBUsername = null;
		while (rs.next()) {
			DBUsername = rs.getString("user_name");
		}

		if (DBUsername == null) {

			if (RegPass.equals(RegPass2)) {
				long regDate = System.currentTimeMillis(); 
				db.query("INSERT INTO " + "forum_users(user_name,password,email,registerdate,type) "
						+ "VALUES(\"" + RegUser + "\",password(\"" + RegPass + "\"),\"" + RegEmail
						+ "\","+regDate+",\"user\")");
				db.close();
				response.sendRedirect("../info.jsp?action=regcomplete");
			} else {
				response.sendRedirect("../info.jsp?action=wrongpass");
			}
		} else {
			response.sendRedirect("../info.jsp?action=userexists");
		}
	} catch (Exception e) {
		e.printStackTrace();
		e.printStackTrace();
	}
%>