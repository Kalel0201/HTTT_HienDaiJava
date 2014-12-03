<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/loan/add" class="frm">
		<p><label>DateCreated</label><input type="text" name="dateCreated" id="dateCreated" /></p>
		<p><label>UserId</label><input type="text" name="userId" id="userId" class="txtdate" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
