package DTO;

import java.util.Date;

public class Loan{
	private int loanId;
	private Date dateCreated;
	private int userId;

	public Loan(){
	}
	public Loan(int loanId, Date dateCreated, int userId){
		this.loanId = loanId;
		this.dateCreated = dateCreated;
		this.userId = userId;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
