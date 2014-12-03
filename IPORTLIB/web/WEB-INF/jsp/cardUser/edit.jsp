<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/cardUser/add" class="frm">
		<p><label>UserId</label><input type="text" name="userId" id="userId" class="txtdate" /></p>
		<p><label>CardUserNo</label><input type="text" name="cardUserNo" id="cardUserNo" /></p>
		<p><label>UserName</label><input type="text" name="userName" id="userName" class="txtlarge" /></p>
		<p><label>Password</label><input type="text" name="password" id="password" class="txtlarge" /></p>
		<p><label>Status</label><input type="text" name="status" id="status" /></p>
		<p><label>DueDate</label><input type="text" name="dueDate" id="dueDate" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
