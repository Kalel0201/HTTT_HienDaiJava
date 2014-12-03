package DTO;
public class Book{
	private int bookId;
	private int publicationId;
	private int storeId;
	private String numberSpecific;
	private boolean status;

	public Book(){
	}
	public Book(int bookId, int publicationId, int storeId, String numberSpecific, boolean status){
		this.bookId = bookId;
		this.publicationId = publicationId;
		this.storeId = storeId;
		this.numberSpecific = numberSpecific;
		this.status = status;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getPublicationId() {
		return publicationId;
	}
	public void setPublicationId(int publicationId) {
		this.publicationId = publicationId;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getNumberSpecific() {
		return numberSpecific;
	}
	public void setNumberSpecific(String numberSpecific) {
		this.numberSpecific = numberSpecific;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
