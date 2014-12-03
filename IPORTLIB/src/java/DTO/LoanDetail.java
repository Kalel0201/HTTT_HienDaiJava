package DTO;

import java.util.Date;

public class LoanDetail{
	private int loanDetailId;
	private int loanId;
	private int bookId;
	private Date dateLoan;
	private Date datePay;

	public LoanDetail(){
	}
	public LoanDetail(int loanDetailId, int loanId, int bookId, Date dateLoan, Date datePay){
		this.loanDetailId = loanDetailId;
		this.loanId = loanId;
		this.bookId = bookId;
		this.dateLoan = dateLoan;
		this.datePay = datePay;
	}
	public int getLoanDetailId() {
		return loanDetailId;
	}
	public void setLoanDetailId(int loanDetailId) {
		this.loanDetailId = loanDetailId;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public Date getDateLoan() {
		return dateLoan;
	}
	public void setDateLoan(Date dateLoan) {
		this.dateLoan = dateLoan;
	}
	public Date getDatePay() {
		return datePay;
	}
	public void setDatePay(Date datePay) {
		this.datePay = datePay;
	}

}
