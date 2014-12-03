package DTO;
public class Supplier{
	private int supplierId;
	private String supplierName;
	private String address;
	private int provinceId;
	private String email;
	private String webPage;
	private String phone;
	private String accountName;
	private String bankName;
	private String taxCode;

	public Supplier(){
	}
	public Supplier(int supplierId, String supplierName, String address, int provinceId, String email, String webPage, String phone, String accountName, String bankName, String taxCode){
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.address = address;
		this.provinceId = provinceId;
		this.email = email;
		this.webPage = webPage;
		this.phone = phone;
		this.accountName = accountName;
		this.bankName = bankName;
		this.taxCode = taxCode;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebPage() {
		return webPage;
	}
	public void setWebPage(String webPage) {
		this.webPage = webPage;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

}
