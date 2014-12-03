package DTO;

import java.util.Date;

public class CardUser{
	private int cardUserId;
	private int userId;
	private String cardUserNo;
	private String userName;
	private String password;
	private boolean status;
	private Date dueDate;

	public CardUser(){
	}
	public CardUser(int cardUserId, int userId, String cardUserNo, String userName, String password, boolean status, Date dueDate){
		this.cardUserId = cardUserId;
		this.userId = userId;
		this.cardUserNo = cardUserNo;
		this.userName = userName;
		this.password = password;
		this.status = status;
		this.dueDate = dueDate;
	}
	public int getCardUserId() {
		return cardUserId;
	}
	public void setCardUserId(int cardUserId) {
		this.cardUserId = cardUserId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCardUserNo() {
		return cardUserNo;
	}
	public void setCardUserNo(String cardUserNo) {
		this.cardUserNo = cardUserNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

}
