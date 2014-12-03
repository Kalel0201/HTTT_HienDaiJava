package DTO;
public class Author{
	private int authorId;
	private String authorNo;
	private String authorName;
	private String note;

	public Author(){
	}
	public Author(int authorId, String authorNo, String authorName, String note){
		this.authorId = authorId;
		this.authorNo = authorNo;
		this.authorName = authorName;
		this.note = note;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorNo() {
		return authorNo;
	}
	public void setAuthorNo(String authorNo) {
		this.authorNo = authorNo;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

}
