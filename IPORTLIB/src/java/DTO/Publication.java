package DTO;
public class Publication{
	private int publicationId;
	private int topicId;
	private int authorId;
	private int publisherId;
	private int publicationTypeId;
	private int majorId;
	private int languageId;
	private String title;
	private String subTitle;
	private int publisherYear;
	private int edition;
	private String copyright;
	private String description;
	private String size;
	private int unitId;
	private int price;
	private int currencyId;
	private int quantity;
	private String numberDewey;
	private String iSBN;
	private String note;

	public Publication(){
	}
	public Publication(int publicationId, int topicId, int authorId, int publisherId, int publicationTypeId, int majorId, int languageId, String title, String subTitle, int publisherYear, int edition, String copyright, String description, String size, int unitId, int price, int currencyId, int quantity, String numberDewey, String iSBN, String note){
		this.publicationId = publicationId;
		this.topicId = topicId;
		this.authorId = authorId;
		this.publisherId = publisherId;
		this.publicationTypeId = publicationTypeId;
		this.majorId = majorId;
		this.languageId = languageId;
		this.title = title;
		this.subTitle = subTitle;
		this.publisherYear = publisherYear;
		this.edition = edition;
		this.copyright = copyright;
		this.description = description;
		this.size = size;
		this.unitId = unitId;
		this.price = price;
		this.currencyId = currencyId;
		this.quantity = quantity;
		this.numberDewey = numberDewey;
		this.iSBN = iSBN;
		this.note = note;
	}
	public int getPublicationId() {
		return publicationId;
	}
	public void setPublicationId(int publicationId) {
		this.publicationId = publicationId;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public int getPublicationTypeId() {
		return publicationTypeId;
	}
	public void setPublicationTypeId(int publicationTypeId) {
		this.publicationTypeId = publicationTypeId;
	}
	public int getMajorId() {
		return majorId;
	}
	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public int getPublisherYear() {
		return publisherYear;
	}
	public void setPublisherYear(int publisherYear) {
		this.publisherYear = publisherYear;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getUnitId() {
		return unitId;
	}
	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getNumberDewey() {
		return numberDewey;
	}
	public void setNumberDewey(String numberDewey) {
		this.numberDewey = numberDewey;
	}
	public String getISBN() {
		return iSBN;
	}
	public void setISBN(String iSBN) {
		this.iSBN = iSBN;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

}
