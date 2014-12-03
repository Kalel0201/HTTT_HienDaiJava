<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<a href="${pageContext.request.contextPath}/author/add">Add</a>
<table class="table">
	<tr><th>Name</th><th class="colsmall">Edit</th><th class="colsmall">Delete</th></tr>
	<c:forEach var="item" items="${authors}">
		<tr>
			<td>${item.authorName}</td>
			<td><a href="${pageContext.request.contextPath}/author/edit/${item.authorId}"><img src="${pageContext.request.contextPath}/images/Edit.gif" /></a></td>
			<td><a href="${pageContext.request.contextPath}/author/delete/${item.authorId}"><img src="${pageContext.request.contextPath}/images/Delete.gif" /></a></td>
		</tr>
	</c:forEach>
</table>
<div class="paging">
    <c:forEach var="i" begin="0" end="${nPage}">
        <span><a href="${pageContext.request.contextPath}/author/index/${i}">${i}</a></span>
    </c:forEach>
</div>
