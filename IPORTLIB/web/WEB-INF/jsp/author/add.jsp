<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/author/add" class="frm">
		<p><label>AuthorNo</label><input type="text" name="authorNo" id="authorNo" /></p>
		<p><label>AuthorName</label><input type="text" name="authorName" id="authorName" class="txtlarge" /></p>
		<p><label>Note</label><input type="text" name="note" id="note" class="txtlarge" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
