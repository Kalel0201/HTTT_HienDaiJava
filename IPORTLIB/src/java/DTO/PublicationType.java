package DTO;
public class PublicationType{
	private int publicationTypeId;
	private String publicationTypeName;

	public PublicationType(){
	}
	public PublicationType(int publicationTypeId, String publicationTypeName){
		this.publicationTypeId = publicationTypeId;
		this.publicationTypeName = publicationTypeName;
	}
	public int getPublicationTypeId() {
		return publicationTypeId;
	}
	public void setPublicationTypeId(int publicationTypeId) {
		this.publicationTypeId = publicationTypeId;
	}
	public String getPublicationTypeName() {
		return publicationTypeName;
	}
	public void setPublicationTypeName(String publicationTypeName) {
		this.publicationTypeName = publicationTypeName;
	}

}
