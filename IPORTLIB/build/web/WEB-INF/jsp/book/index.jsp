<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<a href="${pageContext.request.contextPath}/book/add">Add</a>
<table class="table">
	<tr><th>Name</th><th class="colsmall">Edit</th><th class="colsmall">Delete</th></tr>
	<c:forEach var="item" items="${books}">
		<tr>
			<td>${item.bookName}</td>
			<td><a href="${pageContext.request.contextPath}/book/edit/${item.bookId}"><img src="${pageContext.request.contextPath}/images/Edit.gif" /></a></td>
			<td><a href="${pageContext.request.contextPath}/book/delete/${item.bookId}"><img src="${pageContext.request.contextPath}/images/Delete.gif" /></a></td>
		</tr>
	</c:forEach>
</table>
