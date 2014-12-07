<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/loanDetail/add" class="frm">
		<p><label>LoanId</label><input type="text" name="loanId" id="loanId" class="txtdate" /></p>
		<p><label>BookId</label><input type="text" name="bookId" id="bookId" class="txtdate" /></p>
		<p><label>DateLoan</label><input type="text" name="dateLoan" id="dateLoan" /></p>
		<p><label>DatePay</label><input type="text" name="datePay" id="datePay" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
