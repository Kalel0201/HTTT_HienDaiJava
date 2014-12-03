package DTO;
public class Attachment{
	private int attachmentId;
	private String url;
	private int attachmentTypeId;

	public Attachment(){
	}
	public Attachment(int attachmentId, String url, int attachmentTypeId){
		this.attachmentId = attachmentId;
		this.url = url;
		this.attachmentTypeId = attachmentTypeId;
	}
	public int getAttachmentId() {
		return attachmentId;
	}
	public void setAttachmentId(int attachmentId) {
		this.attachmentId = attachmentId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getAttachmentTypeId() {
		return attachmentTypeId;
	}
	public void setAttachmentTypeId(int attachmentTypeId) {
		this.attachmentTypeId = attachmentTypeId;
	}

}
