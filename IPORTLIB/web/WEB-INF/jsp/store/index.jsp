<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<a href="${pageContext.request.contextPath}/store/add">Add</a>
<table class="table">
	<tr><th>Name</th><th class="colsmall">Edit</th><th class="colsmall">Delete</th></tr>
	<c:forEach var="item" items="${stores}">
		<tr>
			<td>${item.storeName}</td>
			<td><a href="${pageContext.request.contextPath}/store/edit/${item.storeId}"><img src="${pageContext.request.contextPath}/images/Edit.gif" /></a></td>
			<td><a href="${pageContext.request.contextPath}/store/delete/${item.storeId}"><img src="${pageContext.request.contextPath}/images/Delete.gif" /></a></td>
		</tr>
	</c:forEach>
</table>
