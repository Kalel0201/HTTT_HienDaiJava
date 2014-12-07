<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/attachment/add" class="frm">
		<p><label>Url</label><input type="text" name="url" id="url" class="txtlarge" /></p>
		<p><label>AttachmentTypeId</label><input type="text" name="attachmentTypeId" id="attachmentTypeId" class="txtdate" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
