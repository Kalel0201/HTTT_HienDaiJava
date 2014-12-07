<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><tiles:insertAttribute name="title" /></title>
    <link href="${pageContext.request.contextPath}/images/admin.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <div id="top">
        <ul class="wrapper">
            <li><a href="/Home/Logout">Logout</a></li>
        </ul>
    </div>
    <div id="banner">
        <h1 class="wrapper">Cổng thông tin Thư viện ĐẠI HỌC KHOA HỌC TỰ NHIÊN TP.HỒ CHÍ MINH</h1>
    </div>
    <div id="menu">
        <ul class="wrapper">
            <li><a href="${pageContext.request.contextPath}/config/index">Config</a></li>
            <li><a href="${pageContext.request.contextPath}/country/index">Country</a></li>
            <li><a href="${pageContext.request.contextPath}/province/index">Province</a></li>
            <li><a href="${pageContext.request.contextPath}/supplier/index">Supplier</a></li>
            <li><a href="${pageContext.request.contextPath}/publisher/index">Publisher</a></li>
            <li><a href="${pageContext.request.contextPath}/author/index">Author</a></li>
            <li><a href="${pageContext.request.contextPath}/topic/index">Topic</a></li>
            <li><a href="${pageContext.request.contextPath}/publicationType/index">PublicationType</a></li>
            <li><a href="${pageContext.request.contextPath}/unit/index">Unit</a></li>
            <li><a href="${pageContext.request.contextPath}/currency/index">Currency</a></li>
            <li><a href="${pageContext.request.contextPath}/major/index">Major</a></li>
            <li><a href="${pageContext.request.contextPath}/language/index">Language</a></li>
            <li><a href="${pageContext.request.contextPath}/publication/index">Publication</a></li>
            <li><a href="${pageContext.request.contextPath}/store/index">Store</a></li>
            <li><a href="${pageContext.request.contextPath}/book/index">Book</a></li>
            <li><a href="${pageContext.request.contextPath}/department/index">Department</a></li>
            <li><a href="${pageContext.request.contextPath}/group/index">Group</a></li>
            <li><a href="${pageContext.request.contextPath}/attachmentType/index">AttachmentType</a></li>
            <li><a href="${pageContext.request.contextPath}/attachment/index">Attachment</a></li>
            <li><a href="${pageContext.request.contextPath}/user/index">User</a></li>
            <li><a href="${pageContext.request.contextPath}/cardUser/index">CardUser</a></li>
            <li><a href="${pageContext.request.contextPath}/loan/index">Loan</a></li>
            <li><a href="${pageContext.request.contextPath}/loanDetail/index">LoanDetail</a></li>
            <li><a href="${pageContext.request.contextPath}/status/index">Status</a></li>
        </ul>
    </div>
    <div id="main" class="wrapper">
    	<tiles:insertAttribute name="main" />
    </div>
    <div id="footer">
        <div id="footer-copyright">
            <div class="wrapper">Coppyright &copy; Group 07</div>
        </div>
    </div>
</body>
</html>
