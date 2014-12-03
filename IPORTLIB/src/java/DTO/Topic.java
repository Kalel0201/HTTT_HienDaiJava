package DTO;
public class Topic{
	private int topicId;
	private String topicName;
	private String note;

	public Topic(){
	}
	public Topic(int topicId, String topicName, String note){
		this.topicId = topicId;
		this.topicName = topicName;
		this.note = note;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

}
