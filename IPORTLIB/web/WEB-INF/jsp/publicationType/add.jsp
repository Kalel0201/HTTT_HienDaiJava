<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/publicationType/add" class="frm">
		<p><label>PublicationTypeName</label><input type="text" name="publicationTypeName" id="publicationTypeName" class="txtlarge" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
