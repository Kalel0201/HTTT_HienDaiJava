<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/publisher/add" class="frm">
		<p><label>PublisherName</label><input type="text" name="publisherName" id="publisherName" class="txtlarge" /></p>
		<p><label>Note</label><input type="text" name="note" id="note" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
