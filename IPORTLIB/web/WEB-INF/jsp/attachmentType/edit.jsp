<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/attachmentType/add" class="frm">
		<p><label>AttachmentTypeName</label><input type="text" name="attachmentTypeName" id="attachmentTypeName" class="txtlarge" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
