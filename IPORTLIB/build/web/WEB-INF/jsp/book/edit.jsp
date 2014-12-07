<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/book/add" class="frm">
		<p><label>PublicationId</label><input type="text" name="publicationId" id="publicationId" class="txtdate" /></p>
		<p><label>StoreId</label><input type="text" name="storeId" id="storeId" class="txtdate" /></p>
		<p><label>NumberSpecific</label><input type="text" name="numberSpecific" id="numberSpecific" /></p>
		<p><label>Status</label><input type="text" name="status" id="status" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
