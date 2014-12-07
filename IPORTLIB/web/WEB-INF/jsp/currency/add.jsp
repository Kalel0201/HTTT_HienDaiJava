<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/currency/add" class="frm">
		<p><label>CurrencyName</label><input type="text" name="currencyName" id="currencyName" class="txtlarge" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
