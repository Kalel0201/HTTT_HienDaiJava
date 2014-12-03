<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/province/add" class="frm">
		<p><label>CountryId</label><input type="text" name="countryId" id="countryId" class="txtdate" /></p>
		<p><label>ProvinceNo</label><input type="text" name="provinceNo" id="provinceNo" /></p>
		<p><label>ProvinceName</label><input type="text" name="provinceName" id="provinceName" class="txtlarge" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
