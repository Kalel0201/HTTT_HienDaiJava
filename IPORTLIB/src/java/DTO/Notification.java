package DTO;

import java.util.Date;

public class Notification {
    private int noID;
    private String title;
    private Date created;
    private String name;
    
    public Notification () {
    }

    public Notification(int noID, String title, Date created, String name) {
        this.noID = noID;
        this.title = title;
        this.created = created;
        this.name = name;
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
    
    
}
