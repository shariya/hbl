
<%
	String sessionUsername = (String) session.getAttribute("username");
%>
<%
	String sessionType = (String) session.getAttribute("type");
%>
<Body>


	<jsp:include page="table_start.jsp" flush="true" />
	<jsp:include page="table_title.jsp" flush="true">
		<jsp:param name="title" value="Windows Login" />
		<jsp:param name="colspan" value="1" />
		<jsp:param name="align" value="left" />
	</jsp:include>
	<jsp:include page="table_start_body.jsp" flush="true" />
	<jsp:include page="table_body.jsp" flush="true">
		<jsp:param name="width" value="0" />
	</jsp:include>
	<div class="row">
		<div class="col-md-12">
			<table width="100%" height="0" border="0" cellpadding="0"
				cellspacing="0" class="infobar">
				<tr>
					<td width="50%" height="0" align="left" valign="top">
						<%
							if (sessionUsername != null) {
						%> <a
						href="./index.jsp?page=profile">Change Forum Profile</a> <%
 	} else {
 %>
						<form action="action/Login.jsp" method=POST name=form>
							<table width="100">
								<tbody>
									<tr>
										<td align="right"><b>Username</b></td>
										<td><input type="text" name="username" size="20"
											maxlength="100"></td>
									</tr>
									<tr>
										<td align="right"><b>Password</b></td>
										<td><input type="password" name="password" size="20"
											maxlength="100"></td>
									</tr>
									<tr>
										<td><input type="submit" value="Login">
									</tr>
								</tbody>
							</table>
						</form> <%
 	}
 %>
					</td>
					<td width="50%" height="0" align="right" valign="top">
						<%
							if (sessionUsername != null) {
						%> Logged in as: <%=sessionUsername%>
						Type: <%=sessionType%> &nbsp;&nbsp;[<a href="action/Logout.jsp">Logout</a>]
						<%
 	}
 %>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<jsp:include page="table_close_body.jsp" flush="true" />
	<jsp:include page="table_close.jsp" flush="true" />