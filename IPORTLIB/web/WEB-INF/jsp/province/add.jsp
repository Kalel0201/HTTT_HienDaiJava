<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form:form commandName="province" action="${pageContext.request.contextPath}/province/add" method="post" cssClass="frm">
    <p>
        <label>CountryId</label>
        <form:select path="countryId">
            <form:option value="0">---Select Parent---</form:option>
            <form:options itemValue="countryId" itemLabel="countryName" items="${countries}"></form:options>
        </form:select>
    </p>
    <p><label>ProvinceNo</label><form:input path="provinceNo" /></p>
    <p><label>ProvinceName</label><form:input path="provinceName" /></p>
    <p>
        <label>&nbsp;</label>
        <input type="submit" value="Save" class="btn" />
    </p>
</form:form>
