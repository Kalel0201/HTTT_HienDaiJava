package DTO;
public class Publisher{
	private int publisherId;
	private String publisherName;
	private String note;

	public Publisher(){
	}
	public Publisher(int publisherId, String publisherName, String note){
		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.note = note;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

}
