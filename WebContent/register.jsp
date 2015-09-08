<jsp:include page="header.jsp" flush="true">
	<jsp:param name="title" value="Forum" /> 
</jsp:include>
<jsp:include page="body.jsp" flush="true" />
<br>
<jsp:include page="table_start.jsp" flush="true" /> 
<jsp:include page="table_title.jsp" flush="true">
	<jsp:param name="title" value="Register" /> 
	<jsp:param name="colspan" value="1" /> 
	<jsp:param name="align" value="left" /> 
</jsp:include>						
<jsp:include page="table_start_body.jsp" flush="true" />
<jsp:include page="table_body.jsp" flush="true">
	<jsp:param name="width" value="0" /> 
</jsp:include>

<form action="action/AddUser.jsp" method=POST name=form>
	Username:<br>
	<input type="text" name="user" size="62" maxlength="60"><br>
	Password:<br>
	<input type="password" name="password" size="62" maxlength="60"><br>
	Retype Password:<br>
	<input type="password" name="password2" size="62" maxlength="60"><br>
	E-mail:<br>
	<input type="text" name="email" size="62" maxlength="60"><br>
	<input type="submit" value="Register Here !! "><br>
</form>

<jsp:include page="table_close_body.jsp" flush="true" />				 
<jsp:include page="table_close.jsp" flush="true" />
<jsp:include page="footer.jsp" flush="true" />