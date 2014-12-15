package DTO;

import java.util.Date;

public class Notification {
    private int NoID;
    private String Title;
    private Date Created;
    private String Name;
    
    public Notification () {
    }
    
    public Notification (int NoID, String Title, Date Created, String Name) {
        this.NoID = NoID;
        this.Title = Title;
        this.Created = Created;
        this.Name = Name;
    }
    
    public int getNoID() {
        return this.NoID;
    }
    
    public void setNoID(int NoID) {
        this.NoID = NoID;
    }
    
    public String getTitle() {
        return this.Title;
    }
    
    public void setTitle(String Title) {
        this.Title = Title;
    }
    
    public Date getCreated() {
        return this.Created;
    }
    
    public void setCreated(Date Created) {
        this.Created = Created;
    }
    
    public String getName() {
        return this.Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }
}
