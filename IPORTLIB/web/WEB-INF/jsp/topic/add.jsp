<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/topic/add" class="frm">
		<p><label>TopicName</label><input type="text" name="topicName" id="topicName" class="txtlarge" /></p>
		<p><label>Note</label><input type="text" name="note" id="note" class="txtlarge" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
