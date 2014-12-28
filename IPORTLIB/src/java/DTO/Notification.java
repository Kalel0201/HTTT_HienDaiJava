package DTO;

import java.util.Date;

public class Notification {
    private int noID;
    private String title;
    private Date created;
    private String name;
    private String pubTitle;
    private Date dateLoan;
    private Date datePay;
    private int loanDetailsID;

    public Notification() {
    }

    public Notification(int noID, String title, Date created, String name, String pubTitle, Date dateLoan, Date datePay, int loanDetailsID) {
        this.noID = noID;
        this.title = title;
        this.created = created;
        this.name = name;
        this.pubTitle = pubTitle;
        this.dateLoan = dateLoan;
        this.datePay = datePay;
        this.loanDetailsID = loanDetailsID;
    }

    

    public int getNoID() {
        return noID;
    }

    public void setNoID(int noID) {
        this.noID = noID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPubTitle() {
        return pubTitle;
    }

    public void setPubTitle(String pubTitle) {
        this.pubTitle = pubTitle;
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

    public int getLoanDetailsID() {
        return loanDetailsID;
    }

    public void setLoanDetailsID(int loanDetailsID) {
        this.loanDetailsID = loanDetailsID;
    }

    
    
    
}
