<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/supplier/add" class="frm">
		<p><label>SupplierName</label><input type="text" name="supplierName" id="supplierName" class="txtlarge" /></p>
		<p><label>Address</label><input type="text" name="address" id="address" class="txtlarge" /></p>
		<p><label>ProvinceId</label><input type="text" name="provinceId" id="provinceId" class="txtdate" /></p>
		<p><label>Email</label><input type="text" name="email" id="email" /></p>
		<p><label>WebPage</label><input type="text" name="webPage" id="webPage" /></p>
		<p><label>Phone</label><input type="text" name="phone" id="phone" /></p>
		<p><label>AccountName</label><input type="text" name="accountName" id="accountName" class="txtlarge" /></p>
		<p><label>BankName</label><input type="text" name="bankName" id="bankName" /></p>
		<p><label>TaxCode</label><input type="text" name="taxCode" id="taxCode" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
