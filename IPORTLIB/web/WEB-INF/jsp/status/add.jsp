<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/status/add" class="frm">
		<p><label>StatusName</label><input type="text" name="statusName" id="statusName" class="txtlarge" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
