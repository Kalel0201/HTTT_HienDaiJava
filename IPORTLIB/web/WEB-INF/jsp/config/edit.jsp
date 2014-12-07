<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/config/add" class="frm">
		<p><label>ConfigName</label><input type="text" name="configName" id="configName" class="txtlarge" /></p>
		<p><label>DataType</label><input type="text" name="dataType" id="dataType" /></p>
		<p><label>Value</label><input type="text" name="value" id="value" /></p>
		<p><label>StatusId</label><input type="text" name="statusId" id="statusId" class="txtdate" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
